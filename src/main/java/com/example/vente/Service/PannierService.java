package com.example.vente.Service;
import com.example.vente.Entity.PannierEntity;
import com.example.vente.Entity.ProductEntity;
import com.example.vente.Entity.UserEntity;
import com.example.vente.Exceptions.PannierException;
import com.example.vente.Exceptions.ProductException;
import com.example.vente.Repository.PannierRepository;
import com.example.vente.Repository.ProductRepository;
import com.example.vente.Repository.UserRepository;
import com.example.vente.request.pannier.CreatePannierReq;
import com.example.vente.request.pannier.UpdatePannierReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PannierService implements IPannier {
    @Autowired
    private PannierRepository pannierRepo;

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private UserRepository userRepo;



    @Override
    public PannierEntity save(CreatePannierReq pannierReq) {

        Optional<UserEntity> userEntityOptional= userRepo.findById(pannierReq.getUser_id());
        List<ProductEntity> productList = null;
        for (int productId: pannierReq.getProducts_id()) {
            Optional<ProductEntity> productEntityOptional= productRepo.findById(productId);
            if (!productEntityOptional.isPresent()) throw new ProductException("this product no such product withe this id:" + productId);
//            Adding product to the list of product
            ProductEntity productEntity = productEntityOptional.get();
            productList.add(productEntity);
        }
        Optional<ProductEntity> productEntityOptional= productRepo.findById(pannierReq.getUser_id());
        if(userEntityOptional.isPresent() && productList != null){

            PannierEntity newPannierEntity = new PannierEntity();
            newPannierEntity.setId(pannierReq.getId());
            newPannierEntity.setUser(userRepo.getReferenceById(pannierReq.getUser_id()));
//            calcul total price of product exist in the panier
            Double totalPrice = 0.0;
            for (ProductEntity product: productList) {
                totalPrice += product.getPrice();
            }

            newPannierEntity.setTotalPrice(totalPrice);
            return pannierRepo.save(newPannierEntity);

        }else {
            throw new PannierException("needs for a user first" + pannierReq.getUser_id());
        }

    }

    @Override
    public PannierEntity update(UpdatePannierReq req) {

        Optional<PannierEntity> pannierOptional= pannierRepo.findById(req.getId());

        if (pannierOptional.isPresent()){

            PannierEntity pannier = pannierOptional.get();
            return pannier;

        }else {

            throw new ProductException("Category not found for id: " + req.getId());

        }


    }

    @Override
    public ResponseEntity<String> delete(int id) {
        pannierRepo.deleteById(id);
        return null;
    }

    @Override
    public Optional<PannierEntity> getpannier(int id) {
        return pannierRepo.findById(id);
    }
}

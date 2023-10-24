package com.example.vente.Service;

import com.example.vente.Entity.UserEntity;
import com.example.vente.Repository.UserRepository;
import com.example.vente.request.user.CreateUserReq;
import com.example.vente.request.user.UpdateUserReq;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUser{
    @Autowired
    private UserRepository UR;



    @Override
    public UserEntity save(CreateUserReq us) {

        UserEntity product = new UserEntity();
        product.setEmail(us.getEmail());
        product.setRole(us.getRole());
        product.setNumero(us.getNumero());
        product.setPassword(us.getPassword());

        return UR.save(product);
    }

    @Override
    public void delete(int id) {
        UR.deleteById(id);
    }

    @Override
    public Optional<UserEntity> getUser(int id) {
        return UR.findById(id);
    }
    @Override
    public UserEntity update(UpdateUserReq req) {

        Optional<UserEntity> userOptional= UR.findById(req.getId());

        if (userOptional.isPresent()){
            UserEntity product = userOptional.get();
            product.setEmail(req.getEmail());
            product.setRole(req.getRole());
            product.setNumero(req.getNumero());
            product.setPassword(req.getPassword());
            return UR.save(product);
        }else {
            throw new EntityNotFoundException("Category not found for id: " + req.getId());
        }
    }


}

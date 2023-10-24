package com.example.vente.Controller;

import com.example.vente.Entity.PannierEntity;
import com.example.vente.Exceptions.PannierException;
import com.example.vente.Service.IPannier;
import com.example.vente.request.pannier.CreatePannierReq;
import com.example.vente.request.pannier.UpdatePannierReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/panniers")
public class PannierController {

    @Autowired
    private IPannier pannierService;

    @PostMapping
    public PannierEntity createPannier(@RequestBody CreatePannierReq pannier) {
        try {
            return pannierService.save(pannier);

        }catch (Exception e){
            throw new PannierException("Erreur lors de la création de la catégorie.");
        }

    }

    @GetMapping("/{id}")
    public Optional<PannierEntity> getPannier(@PathVariable int id) {
    try {
        return pannierService.getpannier(id);
    } catch (Exception e) {
        throw new PannierException ("Erreur lors de la récupération de la Pannier.");
    }}



    @PutMapping("/update")
    public PannierEntity updateCategory(@RequestBody UpdatePannierReq req) {

        return pannierService.update(req);
    }





    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePannier(@PathVariable int id) {
        return pannierService.delete(id);


    }
}

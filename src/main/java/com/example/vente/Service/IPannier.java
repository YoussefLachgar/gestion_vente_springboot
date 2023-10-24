package com.example.vente.Service;

import com.example.vente.Entity.PannierEntity;
import com.example.vente.request.pannier.CreatePannierReq;
import com.example.vente.request.pannier.UpdatePannierReq;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IPannier {
    PannierEntity save(CreatePannierReq pannier);
    PannierEntity update(UpdatePannierReq pannier);
    ResponseEntity<String> delete(int id);
    Optional<PannierEntity> getpannier(int id);
}

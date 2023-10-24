package com.example.vente.Controller;


import com.example.vente.Service.ICategory;
import com.example.vente.Service.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ICategory cat;

    @Autowired
    private IProduct pro;

//    @Autowired
//    private IUser user;


    @RequestMapping("/test")
    public String test() {
        return "Testing message";
    }


}

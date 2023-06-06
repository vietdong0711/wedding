package com.example.wedding.controller;

import com.example.wedding.request.ProductRequest;
import com.example.wedding.response.ProductResponse;
import com.example.wedding.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/wedding/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping()
    public ResponseEntity<?> getProducts(){
        List<ProductResponse> responses =  productService.getProducts();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createProduct(@RequestBody ProductRequest request){
        productService.createProduct(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

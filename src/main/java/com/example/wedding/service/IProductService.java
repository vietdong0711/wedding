package com.example.wedding.service;

import com.example.wedding.request.ProductRequest;
import com.example.wedding.response.ProductResponse;

import java.util.List;

public interface IProductService {

    void createProduct(ProductRequest request);

    List<ProductResponse> getProducts();
}

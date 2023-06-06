package com.example.wedding.service.impl;

import com.example.wedding.entity.Product;
import com.example.wedding.repository.IProductRepository;
import com.example.wedding.request.ProductRequest;
import com.example.wedding.response.ProductResponse;
import com.example.wedding.service.IProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createProduct(ProductRequest request) {
        Product product = new Product(request);
        productRepository.save(product);
    }

    @Override
    public List<ProductResponse> getProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse> responses = modelMapper.map(products, new TypeToken<List<ProductResponse>>() {
        }.getType());

        return responses;
    }


}

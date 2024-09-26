package com.hsh.redis.services;

import com.hsh.redis.pojos.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product getProductByID(int id);

}

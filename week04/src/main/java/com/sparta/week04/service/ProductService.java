package com.sparta.week04.service;

import com.sparta.week04.dto.ProductMypriceRequestDto;
import com.sparta.week04.dto.ProductRequestDto;
import com.sparta.week04.entity.Product;
import com.sparta.week04.repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {

    public Product createProduct(ProductRequestDto requestDto) throws SQLException {
        // 요청받은 DTO 로 DB에 저장할 객체 만들기
        Product product = new Product(requestDto);

        ProductRepository productRepository = new ProductRepository();
        productRepository.createProduct(product);

        return product;
    }

    public Product updateProduct(Long id, ProductMypriceRequestDto requestDto) throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        Product product = productRepository.getProduct(id);
        if (product == null) {
            throw new NullPointerException("해당 아이디가 존재하지 않습니다.");
        }

        int myprice = requestDto.getMyprice();
        productRepository.updateMyprice(id, myprice);

        return product;
    }

    public List<Product> getProducts() throws SQLException {
        ProductRepository productRepository = new ProductRepository();
        List<Product> products = productRepository.getProducts();

        return products;
    }
}
package com.pharmacyweb.pharmacyweb.Service;

import com.pharmacyweb.pharmacyweb.Entities.Product;
import com.pharmacyweb.pharmacyweb.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> findAll(int pageNo, int pageSize){

        Pageable pageable = PageRequest.of(pageNo,pageSize);

        Page<Product> products = productRepository.findAll(pageable);

        List<Product> productList = products.getContent();

        return productList;
    }
}

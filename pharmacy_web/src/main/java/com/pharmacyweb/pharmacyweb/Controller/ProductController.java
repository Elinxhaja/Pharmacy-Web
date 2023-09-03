package com.pharmacyweb.pharmacyweb.Controller;

import com.pharmacyweb.pharmacyweb.Entities.Product;
import com.pharmacyweb.pharmacyweb.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
    private ProductService productService;


    @GetMapping
    public ResponseEntity<List<Product>> findAll(@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
                                                 @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize) {
        return new ResponseEntity<>(productService.findAll(pageNo,pageSize), HttpStatus.OK);
    }
}

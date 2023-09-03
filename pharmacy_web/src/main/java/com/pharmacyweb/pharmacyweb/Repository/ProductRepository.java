package com.pharmacyweb.pharmacyweb.Repository;

import com.pharmacyweb.pharmacyweb.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

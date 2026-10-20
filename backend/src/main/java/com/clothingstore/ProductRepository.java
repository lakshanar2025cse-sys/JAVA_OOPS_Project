package com.clothingstore;
import java.util.*; import org.springframework.data.jpa.repository.JpaRepository;
interface ProductRepository extends JpaRepository<Product,Long>{List<Product> findByActiveTrue();Optional<Product> findByIdAndActiveTrue(Long id);}

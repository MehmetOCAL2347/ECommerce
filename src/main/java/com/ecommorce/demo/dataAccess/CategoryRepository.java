package com.ecommorce.demo.dataAccess;

import com.ecommorce.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

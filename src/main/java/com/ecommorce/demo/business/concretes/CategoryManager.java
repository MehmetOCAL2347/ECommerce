package com.ecommorce.demo.business.concretes;

import com.ecommorce.demo.business.abstracts.CategoryService;
import com.ecommorce.demo.business.responses.GetAllCategoriesResponse;

import java.util.List;

public class CategoryManager implements CategoryService {

    @Override
    public List<GetAllCategoriesResponse> getAllCategories() {
        // Buraya business kuralları eklenir
        return null;
    }
}

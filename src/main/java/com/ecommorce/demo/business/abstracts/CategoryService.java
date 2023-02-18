package com.ecommorce.demo.business.abstracts;

import com.ecommorce.demo.business.responses.GetAllCategoriesResponse;

import java.util.List;

public interface CategoryService {
    List<GetAllCategoriesResponse> getAllCategories();
}

package com.ecommorce.demo.business.concretes;

import com.ecommorce.demo.business.abstracts.CategoryService;
import com.ecommorce.demo.business.responses.GetAllCategoriesResponse;
import com.ecommorce.demo.dataAccess.CategoryRepository;
import com.ecommorce.demo.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryManager implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryManager(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<GetAllCategoriesResponse> getAllCategories() {
        // Buraya business kuralları eklenir
        // Buradaki tip dönüşümü başka türlü yapılabilir araştırmak lazım
        List<Category> categories = categoryRepository.findAll();
        List<GetAllCategoriesResponse> brandsResponses = new ArrayList<>();

        for (Category category: categories) {
            GetAllCategoriesResponse responseItem = new GetAllCategoriesResponse();
            responseItem.setId(category.getId());
            responseItem.setName(category.getName());
            responseItem.setImageURL(category.getImageURL());
            responseItem.setDescription(category.getDescription());
            brandsResponses.add(responseItem);
        }

        return brandsResponses;
    }
}

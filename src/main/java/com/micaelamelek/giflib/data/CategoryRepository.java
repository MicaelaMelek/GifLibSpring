package com.micaelamelek.giflib.data;

import com.micaelamelek.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by meme on 05/06/16.
 */

@Component
public class CategoryRepository {

    private List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"Tech"),
            new Category(2,"Ramdom"),
            new Category(3,"Fun"));

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }

    public Category findById(int id){
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id)
                return category;
        }
        return null;
    }
}

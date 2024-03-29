package org.learning.springblogricette.repository;

import org.learning.springblogricette.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    List<Recipe> findByTitle(String name);
}

package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

}

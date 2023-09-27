package com.firtproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firtproject.project.entities.Category;
@Repository
public interface  CategoryRepository  extends JpaRepository<Category, Long>{

}

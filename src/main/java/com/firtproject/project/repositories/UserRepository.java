package com.firtproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firtproject.project.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

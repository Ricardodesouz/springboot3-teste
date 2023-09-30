package com.firtproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firtproject.project.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}

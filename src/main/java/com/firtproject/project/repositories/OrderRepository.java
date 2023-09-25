package com.firtproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firtproject.project.entities.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

}

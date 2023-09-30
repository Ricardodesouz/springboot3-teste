package com.firtproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firtproject.project.entities.OrderItem;
import com.firtproject.project.entities.pk.OrderItemPk;
@Repository
public interface  OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPk>{

}

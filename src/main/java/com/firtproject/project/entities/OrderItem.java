package com.firtproject.project.entities;

import java.util.Objects;

import com.firtproject.project.entities.pk.OrderItemPk;

public class OrderItem {
	private OrderItemPk id;
	private Integer quantity;
	private Double price;
	public OrderItem(Order order, Product product,Integer quantity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Order getOrder() {
		return id.getOrder();
	}
	public void setOder(Order order) {
		id.setOrder(order);
	}
	public Product getOProduct () {
		return id.getProduct();
	}
	public void setProduct(Product prdouct) {
		id.setProduct(prdouct);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	

}

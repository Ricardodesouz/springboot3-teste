package com.firtproject.project.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.firtproject.project.entities.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Entity
@Table(name="tb_order")
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Instant date;
	private Integer status;

	@ManyToOne
	@JoinColumn(name ="client_id")
	private User client; // muitos orders para um clientt
	


	public Order() {
	}

	public Order(Long id, Instant date, OrderStatus status, User client ) {
		super();
		this.id = id;
		this.date = date;
		this.client = client;
		setStatus(status);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public User getClint() {
		return client;
	}

	public void setUser(User client ) {
		this.client = client ;
	}
	public OrderStatus getStatus() {
		return OrderStatus.valueOf(status);
	}
	public void setStatus(OrderStatus status) {
		this.status = status.getCode();
		
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
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
	

}

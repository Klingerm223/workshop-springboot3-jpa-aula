package com.educandoweb.cursospring.entities;

import java.io.Serializable;
import java.util.Objects;

import com.educandoweb.cursospring.entities.pk.OrderItemPk;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPk id = new OrderItemPk();
	private Integer quantity;
	private Double price;
	
	
	public OrderItem ()  {
		
	}


	public OrderItem(Order order,Product product ,Integer quatity, Double price) {
		super();
		
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quatity;
		this.price = price;
	}

	@JsonIgnore
	public Order getOrder () {
		return id.getOrder();
	}
	
	public void setOrder (Order order) {
		id.setOrder(order);
	}
	
	
	public Product getProduct () {
		return id.getProduct();
	}
	
	public void setProduct  (Product product) {
		id.setProduct(product);
	}
	
	
	public Integer getQuatity() {
		return quantity;
	}


	public void setQuatity(Integer quatity) {
		this.quantity = quatity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	public Double getSubTotal () {
		return price * quantity;
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

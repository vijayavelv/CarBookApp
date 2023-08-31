package com.vay.car.booking.vehicles.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order_details")
public class OrderDetails {
	
	@Id
	private Long orderId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transactions.transaction_id")
	private VehicleTransaction transactions;
	
	@NotNull
	@Column(name = "order_date")
	private LocalDateTime orderDate;
	
	@NotNull
	@Column(name = "est_delivery_date")
	private LocalDateTime estimatedDeliveryDate;
	
	
	@Column(name = "actual_delivery_date")
	private LocalDateTime actualDeliveryDate;
	
	@NotNull
	@Column(name = "order_status")
	private String orderStatus;
	
	@NotNull
	@Column(name = "transport_cost")
	private Double transportCost;
	
	@NotNull
	@Column(name = "total_price")
	private Double totalPrice;
	
	
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;
	
	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;

	public OrderDetails(Long orderId, VehicleTransaction transactions, @NotNull LocalDateTime orderDate,
			@NotNull LocalDateTime estimatedDeliveryDate, LocalDateTime actualDeliveryDate, @NotNull String orderStatus,
			@NotNull Double transportCost, @NotNull Double totalPrice, String lastUpdatedBy,
			@NotNull LocalDateTime lastUpdatedTime) {
		super();
		this.orderId = orderId;
		this.transactions = transactions;
		this.orderDate = orderDate;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		this.actualDeliveryDate = actualDeliveryDate;
		this.orderStatus = orderStatus;
		this.transportCost = transportCost;
		this.totalPrice = totalPrice;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public VehicleTransaction getTransactions() {
		return transactions;
	}

	public void setTransactions(VehicleTransaction transactions) {
		this.transactions = transactions;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDateTime getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public LocalDateTime getActualDeliveryDate() {
		return actualDeliveryDate;
	}

	public void setActualDeliveryDate(LocalDateTime actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getTransportCost() {
		return transportCost;
	}

	public void setTransportCost(Double transportCost) {
		this.transportCost = transportCost;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public LocalDateTime getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
}
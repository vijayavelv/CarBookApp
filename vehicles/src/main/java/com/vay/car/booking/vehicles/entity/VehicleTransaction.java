package com.vay.car.booking.vehicles.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="vehicle_transaction")
public class VehicleTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_id")
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer.cust_id")
	private Customer customer;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "line.line_id")
	private VehicleLine line;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "equipment.equipment_id")
	private VehicleEquipment equipment;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "internalPaint.paint_id")
	private VehiclePaint interiorPaint;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exteriorPaint.paint_id")
	private VehiclePaint exteriorPaint;
	
	@NotNull
	@Column(name = "discount")
	private Double discount;
	
	@NotNull
	@Column(name = "total_price")
	private Double totalPrice;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;

	public VehicleTransaction(Long id, Customer customer, VehicleLine line, VehicleEquipment equipment,
			VehiclePaint interiorPaint, VehiclePaint exteriorPaint, @NotNull Double discount,
			@NotNull Double totalPrice, String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		super();
		this.id = id;
		this.customer = customer;
		this.line = line;
		this.equipment = equipment;
		this.interiorPaint = interiorPaint;
		this.exteriorPaint = exteriorPaint;
		this.discount = discount;
		this.totalPrice = totalPrice;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public VehicleLine getLine() {
		return line;
	}

	public void setLine(VehicleLine line) {
		this.line = line;
	}

	public VehicleEquipment getEquipment() {
		return equipment;
	}

	public void setEquipment(VehicleEquipment equipment) {
		this.equipment = equipment;
	}

	public VehiclePaint getInteriorPaint() {
		return interiorPaint;
	}

	public void setInteriorPaint(VehiclePaint interiorPaint) {
		this.interiorPaint = interiorPaint;
	}

	public VehiclePaint getExteriorPaint() {
		return exteriorPaint;
	}

	public void setExteriorPaint(VehiclePaint exteriorPaint) {
		this.exteriorPaint = exteriorPaint;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
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

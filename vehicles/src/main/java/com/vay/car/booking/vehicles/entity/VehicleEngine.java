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
@Table(name = "vehicle_engine")
public class VehicleEngine {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "engine_id")
	private Long id;

	@NotNull
	@Column(name = "engine_name")
	private String engineName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "model.model_id")
	private VehicleModel model;

	@NotNull
	@Column(name = "price")
	private double price;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;

	public VehicleEngine(@NotNull long id, @NotNull String engineName, VehicleModel model, @NotNull double price,
			String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		this.id = id;
		this.engineName = engineName;
		this.model = model;
		this.price = price;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public VehicleModel getModel() {
		return model;
	}

	public void setModel(VehicleModel model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

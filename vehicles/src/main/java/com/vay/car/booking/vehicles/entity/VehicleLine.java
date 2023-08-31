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
@Table(name = "vehicle_line")
public class VehicleLine {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "line_id")
	private long id;

	@NotNull
	@Column(name = "line_name")
	private String lineName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "model.model_id")
	private VehicleModel model;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "engine.engine_id")
	private VehicleEngine engine;
	
	@NotNull
	@Column(name = "price")
	private double price;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;

	public VehicleLine(@NotNull long id, @NotNull String lineName, VehicleModel model, VehicleEngine engine,
			@NotNull double price, String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		this.id = id;
		this.lineName = lineName;
		this.model = model;
		this.engine = engine;
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

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public VehicleModel getModel() {
		return model;
	}

	public void setModel(VehicleModel model) {
		this.model = model;
	}

	public VehicleEngine getEngine() {
		return engine;
	}

	public void setEngine(VehicleEngine engine) {
		this.engine = engine;
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

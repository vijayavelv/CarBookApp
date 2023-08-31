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
@Table(name ="vehicle_paint")
public class VehiclePaint {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "paint_id")
	private Long id;

	@NotNull
	@Column(name = "paint_name")
	private String paintName;
	
	@NotNull
	@Column(name = "paint_type")
	private String paintType;

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

	public VehiclePaint(@NotNull Long id, @NotNull String paintName, @NotNull String paintType, VehicleModel model,
			@NotNull Double price, String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		this.id = id;
		this.paintName = paintName;
		this.paintType = paintType;
		this.model = model;
		this.price = price;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaintName() {
		return paintName;
	}

	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public VehicleModel getModel() {
		return model;
	}

	public void setModel(VehicleModel model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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

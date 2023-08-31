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
@Table(name ="vehicle_equipment")
public class VehicleEquipment {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "equipment_id")
	private Long id;

	@NotNull
	@Column(name = "equipment_name")
	private String equipmentName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "model.model_id")
	private VehicleModel model;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "engine.engine_id")
	private VehicleEngine engine;
	
	@NotNull
	@Column(name = "price")
	private Double price;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;
	

	public VehicleEquipment(@NotNull Long id, @NotNull String equipmentName, VehicleModel model, VehicleEngine engine,
			@NotNull Double price, String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		super();
		this.id = id;
		this.equipmentName = equipmentName;
		this.model = model;
		this.engine = engine;
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

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
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

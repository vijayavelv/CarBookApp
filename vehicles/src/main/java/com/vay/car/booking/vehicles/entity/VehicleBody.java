package com.vay.car.booking.vehicles.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="vehicle_body")
public class VehicleBody {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "body_id")
	private Long id;
	
	@NotNull
	@Column(name = "body_type")
	private String bodyType;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "model.model_id")
	private VehicleModel model;
	
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;
	
	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;
	

	public VehicleBody(@NotNull long id, @NotNull String bodyType, VehicleModel model, String lastUpdatedBy,
			@NotNull LocalDateTime lastUpdatedTime) {
		super();
		this.id = id;
		this.bodyType = bodyType;
		this.model = model;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public VehicleModel getModel() {
		return model;
	}

	public void setModel(VehicleModel model) {
		this.model = model;
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

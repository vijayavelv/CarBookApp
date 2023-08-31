package com.vay.car.booking.vehicles.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "dealer_details")
public class Dealers {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dealer_id")
	private Long id;
	
	@NotNull
	@Column(name = "dealer_name")
	private String dealerName;
	
	@NotNull
	@Column(name = "contact_no")
	private String contactNo;
	
	@NotNull
	@Column(name = "email_id")
	private String emailId;
	
	@NotNull
	@Column(name = "address")
	private String address;
	
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;
	
	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;

	public Dealers(@NotNull Long id, @NotNull String dealerName, @NotNull String contactNo, @NotNull String emailId,
			@NotNull String address, String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		super();
		this.id = id;
		this.dealerName = dealerName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.address = address;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

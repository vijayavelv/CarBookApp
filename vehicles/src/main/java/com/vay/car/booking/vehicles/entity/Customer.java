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
@Table(name = "customer_details")
public final class Customer {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_id")
	private Long id;
	
	@NotNull
	@Column(name = "cust_name")
	private String custName;
	
	@NotNull
	@Column(name = "mobile_no")
	private String mobileNo;
	
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

	public Customer(@NotNull Long id, @NotNull String custName, @NotNull String mobileNo, @NotNull String emailId,
			@NotNull String address, String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		super();
		this.id = id;
		this.custName = custName;
		this.mobileNo = mobileNo;
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

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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

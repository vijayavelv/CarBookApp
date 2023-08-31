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
@Table(name ="login_details")
public class LoginEntity {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long userId;
	
	
	@NotNull
	@Column(name = "user_name")
	private String userName;
	
	
	@NotNull
	@Column(name = "password")
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dealers.dealer_id")
	private Dealers dealers;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roles.role_id")
	private Roles roles;
	
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;
	
	@NotNull
	@Column(name = "last_updated_time")
	private LocalDateTime lastUpdatedTime;

	
	public LoginEntity(@NotNull Long userId, @NotNull String userName, @NotNull String password, Dealers dealers,
			Roles roles, String lastUpdatedBy, @NotNull LocalDateTime lastUpdatedTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.dealers = dealers;
		this.roles = roles;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Dealers getDealers() {
		return dealers;
	}

	public void setDealers(Dealers dealers) {
		this.dealers = dealers;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
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

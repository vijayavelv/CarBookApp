package com.vay.car.booking.vehicles.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vay.car.booking.vehicles.entity.VehicleModel;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Long> {

}

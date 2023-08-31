package com.vay.car.booking.vehicles.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vay.car.booking.vehicles.entity.VehicleBody;

@Repository
public interface VehicleBodyRepository extends JpaRepository<VehicleBody, Long>{

}

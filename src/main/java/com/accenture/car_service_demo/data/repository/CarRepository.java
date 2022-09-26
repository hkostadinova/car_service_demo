package com.accenture.car_service_demo.data.repository;

import com.accenture.car_service_demo.data.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}

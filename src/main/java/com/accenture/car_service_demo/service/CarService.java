package com.accenture.car_service_demo.service;

import com.accenture.car_service_demo.data.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    Car getCar(long id);
    Car create(Car car);
    Car update(Car car, long id);
    void deleteCar(long id);
}

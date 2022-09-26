package com.accenture.car_service_demo.service.implementation;

import com.accenture.car_service_demo.data.entity.Car;
import com.accenture.car_service_demo.data.repository.CarRepository;
import com.accenture.car_service_demo.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCar(long id) {
        return carRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("No such id: " + id));
    }

    @Override
    public Car create(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car update(Car car, long id) {
        car.setId(id);
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(long id) {
        carRepository.delete(getCar(id));
    }


}

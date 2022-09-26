package com.accenture.car_service_demo.controller.api;

import com.accenture.car_service_demo.data.entity.Car;
import com.accenture.car_service_demo.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @RequestMapping("/{id}")
    public Car getCar(@PathVariable("id") long id) {
        return carService.getCar(id);
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.create(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@RequestBody Car car, @PathVariable long id) {
        return carService.update(car, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable long id) {
        carService.deleteCar(id);
    }
}

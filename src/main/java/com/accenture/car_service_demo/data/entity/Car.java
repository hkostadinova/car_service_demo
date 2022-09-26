package com.accenture.car_service_demo.data.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String regPlate;

    private String model;

    private LocalDate productionDate;

    @ManyToOne
    private Customer customer;

    public Car() {
    }

    public Car(long id, String regPlate, String model, LocalDate productionDate, Customer customer) {
        this.id = id;
        this.regPlate = regPlate;
        this.model = model;
        this.productionDate = productionDate;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegPlate() {
        return regPlate;
    }

    public void setRegPlate(String regPlate) {
        this.regPlate = regPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

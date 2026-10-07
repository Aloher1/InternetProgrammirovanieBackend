package ru.ulstu.is.server.api;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ListingDto {
    @JsonProperty(access = Access.READ_ONLY)
    private Integer id;
    @JsonProperty(access = Access.WRITE_ONLY)
    private Integer carId;
    @JsonProperty(access = Access.READ_ONLY)
    private CarDto car;
    private Integer price;
    private LocalDate createdAt;
    private String description;

    public ListingDto() {
    }

    public ListingDto(Integer id, Integer carId, Integer price, LocalDate createdAt, String description) {
        this.id = id;
        this.carId = carId;
        this.price = price;
        this.createdAt = createdAt;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public Boolean setId(Integer id) {
        this.id = id;
        return true;
    }

    public Integer getCarId() {
        return carId;
    }

    public Boolean setCarId(Integer carId) {
        this.carId = carId;
        return true;
    }

    public CarDto getCar() {
        return car;
    }

    public Boolean setCar(CarDto car) {
        this.car = car;
        return true;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean setPrice(Integer price) {
        this.price = price;
        return true;
    }

    public LocalDate getCreationDate() {
        return createdAt;
    }

    public Boolean setCreationDate(LocalDate creationDate) {
        createdAt = creationDate;
        return true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
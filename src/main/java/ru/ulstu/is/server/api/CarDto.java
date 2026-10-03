package ru.ulstu.is.server.api;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class CarDto {
    @JsonProperty(access = Access.READ_ONLY)
    private Integer id;
    private String brand;
    private String model;
    private LocalDate year;
    private Integer price;
    private Integer mileage;
    private String bodyType;
    private String color;
    @JsonProperty("image")
    private String image;
    private String description;

    public CarDto() {
    }

    public CarDto(
            Integer id, 
            String brand, 
            String model,
            LocalDate year,
            Integer price,
            Integer mileage,
            String bodyType,
            String color,
            String description){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.bodyType = bodyType;
        this.color = color;
        this.description = description;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public LocalDate getYear(){
        return year;
    }

    public void setYear(LocalDate year){
        this.year = year;
    }
    
    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public Integer getMileage(){
        return mileage;
    }

    public void setMileage(Integer mileage){
        this.mileage = mileage;
    }

    public String getBodyType(){
        return bodyType;
    }

    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    @Override 
    public String toString(){
        return "CarDto [brand=" + brand + ", model=" + model + ", year=" + year +
                ", price=" + price + ", mileage=" + mileage + ", bodyType=" + bodyType +
                ", color=" + color + ", image=" + image + ", description=" + description;
    }
}

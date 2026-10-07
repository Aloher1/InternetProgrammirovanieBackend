package ru.ulstu.is.server.api;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class CarDto {
    @JsonProperty(access = Access.READ_ONLY)
    private Integer id;
    @JsonProperty (access = Access.WRITE_ONLY)
    private Integer makeId;
    @JsonProperty (access = Access.READ_ONLY)
    private MakeDto make;
    @JsonProperty (access = Access.WRITE_ONLY)
    private Integer modelId;
    @JsonProperty (access = Access.READ_ONLY)
    private ModelDto model;
    private LocalDate year;
    private Integer price;
    private Integer mileage;
    private String bodyType;
    private String color;
    @JsonProperty("image")
    private String photo;
    private String description;

    public CarDto() {
    }

    public CarDto(
            Integer id, 
            Integer makeId, 
            Integer modelId,
            LocalDate year,
            Integer price,
            Integer mileage,
            String bodyType,
            String color,
            String description){
        this.id = id;
        this.makeId = makeId;
        this.modelId = modelId;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.bodyType = bodyType;
        this.color = color;
        this.description = description;
    }

    // Id
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    // Make
    public Integer getMakeId(){
        return makeId;
    }

    public void setMakeId(Integer makeId){
        this.makeId = makeId;
    }

    public MakeDto getMake(){
        return make;
    }

    public void setMake(MakeDto make){
        this.make = make;
    }

    // Model
    public Integer getModelId(){
        return modelId;
    }

    public void setModelId(Integer modelId){
        this.modelId = modelId;
    }

    public ModelDto getModel(){
        return model;
    }

    public void setModel(ModelDto model){
        this.model = model;
    }

    // Year
    public LocalDate getYear(){
        return year;
    }

    public void setYear(LocalDate year){
        this.year = year;
    }
    
    // Price
    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    // Mileage
    public Integer getMileage(){
        return mileage;
    }

    public void setMileage(Integer mileage){
        this.mileage = mileage;
    }

    // BodyType
    public String getBodyType(){
        return bodyType;
    }

    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }
 
    // Color
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Image
    public String getPhoto(){
        return photo;
    }

    public void setPhoto(String image){
        this.photo = image;
    }

    // Description
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    @Override 
    public String toString(){
        return "CarDto [makeId=" + makeId + ", modelId=" + modelId + ", year=" + year +
                ", price=" + price + ", mileage=" + mileage + ", bodyType=" + bodyType +
                ", color=" + color + ", image=" + photo + ", description=" + description;
    }
}

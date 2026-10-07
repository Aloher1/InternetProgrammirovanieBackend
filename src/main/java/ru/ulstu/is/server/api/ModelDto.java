package ru.ulstu.is.server.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ModelDto {
    @JsonProperty(access = Access.READ_ONLY)
    private Integer id;
    @JsonProperty(access = Access.WRITE_ONLY)
    private Integer makeId;
    @JsonProperty(access = Access.READ_ONLY)
    private MakeDto make;
    private String name;

    public ModelDto(){}

    public ModelDto(Integer id, Integer makeId, String name){
        this.id = id;
        this.makeId = makeId;
        this.name = name;
    }

    public Integer getId(){
        return id;
    }

    public Boolean setId(Integer id){
        this.id = id;
        return true;
    }

    public Integer getMakeId(){
        return makeId;
    }

    public Boolean setMakeId(Integer makeId){
        this.makeId = makeId;
        return true;
    } 
    
    public MakeDto getMake(){
        return make;
    }

    public void setMake(MakeDto make){
        this.make = make;
    }

    public String getName(){
        return name;
    }

    public Boolean setName(String name){
        this.name = name;
        return true;
    }
}

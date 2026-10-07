package ru.ulstu.is.server.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class MakeDto {
    @JsonProperty(access = Access.READ_ONLY)
    private Integer id;
    private String name;
    private String imageUrl;

    public MakeDto() {}

    public MakeDto(Integer id, String name, String image){
        this.id = id;
        this.name = name;
        this.imageUrl = image;
    }

    public Integer getId(){
        return id;
    }

    public Boolean setId(Integer id){
        this.id = id;
        return true;
    }

    public String getName(){
        return name;
    }

    public Boolean setName(String name){
        this.name = name;
        return true;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public Boolean setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        return true;
    }
}

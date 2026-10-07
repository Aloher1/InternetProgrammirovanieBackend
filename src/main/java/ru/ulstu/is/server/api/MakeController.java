package ru.ulstu.is.server.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.ulstu.is.server.configuration.Constants;

@RestController 
@RequestMapping(Constants.API_URL + CarController.URL)
public class MakeController {
    public static final String URL = "/car";

    public final List<MakeDto> makes = List.of(
        new MakeDto(1, "Lada", ""),
        new MakeDto(2, "Mercedes", ""),
        new MakeDto(3, "Haval", "")
    );

    @GetMapping 
    public List<MakeDto> getAll(){
        return makes;
    }

    @GetMapping ("/{id}")
    public MakeDto get(@PathVariable int id){
        return makes.stream().filter(make -> make.getId() == id).findAny().orElseThrow(() -> new NotFoundException("Make", id));
    }
}

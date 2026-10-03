package ru.ulstu.is.server.api;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import ru.ulstu.is.server.configuration.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController 
@RequestMapping(Constants.API_URL + CarController.URL)
public class CarController {
    public static final String URL = "/car";

    private final Logger log = LoggerFactory.getLogger(CarController.class);
    private final AtomicInteger idGenerator = new AtomicInteger();

    private final List<CarDto> cars = List.of(
        new CarDto(idGenerator.incrementAndGet(), "Toyota", "Corona", LocalDate.of(1991, 1, 2), 100000, 
                200000, "Седан", "#FFFFFF", "Описание"),
        new CarDto(idGenerator.incrementAndGet(), "Toyota", "Corona", LocalDate.of(1991, 1, 2), 100000, 
                200000, "Седан", "#FFFFFF", "Описание"),
        new CarDto(idGenerator.incrementAndGet(), "Toyota", "Corona", LocalDate.of(1991, 1, 2), 100000, 
                200000, "Седан", "#FFFFFF", "Описание"));

    @GetMapping
    public List<CarDto> getAll() {
        log.debug("Get all cars");
        return cars.stream().toList();
    }
    
    @GetMapping("/{id}")
    public CarDto get(@PathVariable int id) {
        log.debug("Get car with id {}", id);
        return cars.stream()
                .filter(car -> car.getId() == id)
                .findAny()
                .orElseThrow(() -> new NotFoundException("Car", id));
    }
    
    @PostMapping 
    public CarDto create(@RequestBody CarDto newCar){
        log.debug("Create car with data {}", newCar);
        newCar.setId(idGenerator.incrementAndGet());
        newCar.setBrand("Lada");
        // newCar.setModel("taz");
        // newCar.setBodyType("Седан");
        // newCar.setColor("#bebebe");
        // newCar.setMileage(10);
        // newCar.setPrice(50000);
        // newCar.setYear(LocalDate.of(1968, 3, 5));
        // newCar.setDescription("desc");
        cars.add(newCar);
        return newCar;
    }
}

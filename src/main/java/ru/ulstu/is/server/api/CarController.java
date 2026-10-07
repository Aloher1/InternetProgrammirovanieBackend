package ru.ulstu.is.server.api;

import java.time.LocalDate;
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



@RestController 
@RequestMapping(Constants.API_URL + CarController.URL)
public class CarController {
    public static final String URL = "/car";

    private final Logger log = LoggerFactory.getLogger(CarController.class);
    private final AtomicInteger idGenerator = new AtomicInteger();

    private final List<CarDto> cars = List.of(
        new CarDto(idGenerator.incrementAndGet(), 1, 1, LocalDate.parse("1991, 1, 1"), 1000, 1, "Седан", "#bebebe", "описание1"),
        new CarDto(idGenerator.incrementAndGet(), 2, 2, LocalDate.parse("1992, 2, 2"), 2000, 2, "Седан", "#bebebe", "описание2"),
        new CarDto(idGenerator.incrementAndGet(), 3, 3, LocalDate.parse("1993, 3, 3"), 3000, 2, "Седан", "#bebebe", "описание3")
    );

    private final MakeController makeController;

    public CarController(MakeController makeController){
        this.makeController = makeController;
        this.cars.forEach(car -> car.setMake(makeController.get(car.getMakeId())));
    }

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
        newCar.setMake(makeController.get(newCar.getMakeId()));
        cars.add(newCar);
        return newCar;
    }
}

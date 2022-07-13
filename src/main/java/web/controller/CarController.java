package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volkswagen", "red", "Verona Miller"));
        cars.add(new Car("Saab", "blue", "Alexey Minin"));
        cars.add(new Car("Renault", "orange", "Tilly Neighbour"));
        cars.add(new Car("Lada", "grey", "Serge Loiseau"));
        cars.add(new Car("BMW", "black", "Greta Tunberg"));
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getRequestedNumberOfCars(cars, count));
        return "cars";
    }
}

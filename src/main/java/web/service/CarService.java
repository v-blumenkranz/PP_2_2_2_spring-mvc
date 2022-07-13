package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public class CarService {
    public List<Car> getRequestedNumberOfCars(List <Car> cars, int count) {
        if(count == 0) {return cars;}
        return cars.stream().limit(count).toList();
    }
}

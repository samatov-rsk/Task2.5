package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "BMW1", "V8"));
        cars.add(new Car(2, "BMW2", "V8"));
        cars.add(new Car(3, "BMW3", "V8"));
        cars.add(new Car(4, "BMW4", "V8"));
        cars.add(new Car(5, "BMW5", "V8"));
    }

    @Override
    public List<Car> getCountCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0,count);
    }
}
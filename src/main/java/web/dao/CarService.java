package web.dao;

import web.models.Car;
import java.util.List;

public interface CarService {
    List<Car> getCountCars(int count);
}
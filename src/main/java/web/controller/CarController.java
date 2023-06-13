package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarServiceImp;
import web.models.Car;

import java.util.Arrays;


@Controller
public class CarController {

    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("count", carServiceImp.getCountCars(count));
        return "First/cars";
    }

}

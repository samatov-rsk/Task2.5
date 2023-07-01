package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarServiceImp;

@Controller
public class CarController {

    @Autowired
    private CarServiceImp carServiceImp; //используй конструктор для DI

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("count", carServiceImp.getCountCars(count));
        return "First/cars"; //почему First, a ne first? да и почему first вообще? можно views
        //названия в программировании очень важны. они помогают другиз разработчикам понять, что к чему, а не только тебе
    }
}

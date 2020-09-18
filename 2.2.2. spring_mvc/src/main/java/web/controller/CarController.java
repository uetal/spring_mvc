package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(name = "locale") String locale, ModelMap modelMap){
        String message = null;

        if (locale.equals("en")){
            message ="CARS";
        }
        if (locale.equals("ru")){
            message ="МАШИНЫ";
        }

        modelMap.addAttribute("message", message);

        List<Car>carList = new ArrayList<>();
        carList.add(new Car("car1",1,1));
        carList.add(new Car("car2",2,2));
        carList.add(new Car("car3",3,3));
        modelMap.addAttribute("cars",carList);

        return "cars";
    }


}

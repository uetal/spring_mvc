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
    public String printCars(@RequestParam(name = "locale") String locale,
                            @RequestParam(name = "count") int count,
                            ModelMap modelMap) {
        String message = null;

        if (locale.equals("en")){
            message ="CARS";
        }
        if (locale.equals("ru")){
            message ="МАШИНЫ";
        }

        modelMap.addAttribute("message", message);

        List<Car>startCarList = new ArrayList<>();
        startCarList.add(new Car("car1",1,1));
        startCarList.add(new Car("car2",2,2));
        startCarList.add(new Car("car3",3,3));
        startCarList.add(new Car("car4",4,4));
        startCarList.add(new Car("car5",5,5));

        List<Car>carList = new ArrayList<>();

        if (count>5){
            carList.addAll(startCarList);
        }else {
            for (int i = 0; i < count; i++) {
                carList.add(startCarList.get(i));
            }
        }
        modelMap.addAttribute("cars",carList);

        return "cars";
    }


}

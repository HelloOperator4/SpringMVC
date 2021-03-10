package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class HelloController {

	private final CarService carService;

	@Autowired
	public HelloController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping("/hello")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "hello";
	}
	@GetMapping("/cars")
	public ModelAndView printCarsFromList(@RequestParam(defaultValue = "5",
			value = "count", required = false) int count) {

		ModelAndView modelAndView = new ModelAndView("cars");
		return modelAndView.addObject("carsFromList",
				carService.listCar().stream().limit(count).
						collect(Collectors.toList()));
	}
}
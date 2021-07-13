package com.nutrition.nutrition.contollers;

import java.util.HashMap;
import java.util.Map;

import com.nutrition.nutrition.model.Patient;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
  @GetMapping("/")
  public String home(){
    return "Hello Controller";
  }

  @RequestMapping(value = "/patient", method = RequestMethod.GET)
  public Map<String, String> patient(){
    HashMap<String, String> map = new HashMap<>();
    Patient myPatient = new Patient(1, "Ricardo");
    

    map.put("name", myPatient.getName());
    map.put("age", "myAge");
    map.put("weight", "70");
    return map;
  }
}

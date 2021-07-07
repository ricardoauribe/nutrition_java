package com.nutrition.nutrition;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
  @GetMapping("/")
  public Map<String, String> home(){
    HashMap<String, String> map = new HashMap<>();
    map.put("key", "value");
    map.put("foo", "bar");
    map.put("aa", "bb");
    return map;
  }

  @GetMapping("/patient")
  public Map<String, String> patient(){
    HashMap<String, String> map = new HashMap<>();
    Patient myPatient = new Patient(1, "Ricardo");

    map.put("name", myPatient.getName());
    map.put("age", "myAge");
    map.put("weight", "70");
    return map;
  }
}

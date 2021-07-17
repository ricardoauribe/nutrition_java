package com.nutrition.nutrition.contollers;

import java.util.HashMap;
import java.util.Map;

import com.nutrition.nutrition.model.Patient;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@CrossOrigin
public class HomeController {

  Logger logger = LogManager.getLogger(getClass());

  @ApiIgnore
  @ApiOperation(value = "This method is used to get the author name.")
  @GetMapping("/")
  public String home(){
    
    logger.info("This is a simple message at INFO level. " +
      "It will be hidden.");
    
    return "Hello Controller";
  }

  @ApiOperation(value = "This method is used to get the current date.")
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

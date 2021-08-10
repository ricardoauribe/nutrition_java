package com.nutrition.nutrition.contollers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.nutrition.nutrition.model.Patient;
import com.nutrition.nutrition.model.Record;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
public class RecordController {
  
  Logger logger = LogManager.getLogger(getClass());

  @ApiOperation(value = "This method is used to get a record from a patient.")
  @RequestMapping(value = "/record", method = RequestMethod.GET)
  public Map<String, String> record(){
    HashMap<String, String> map = new HashMap<>();
    
    long id = 1;
    Date todayDate = new Date();
    Patient myPatient = new Patient(1, "Ricardo");

    Record myRecord = new Record(id, todayDate, myPatient);
    

    map.put("id", String.valueOf(myRecord.getId()));
    map.put("date", String.valueOf(myRecord.getRecordDate()));
    map.put("patient", myRecord.getPatient().getName());
    return map;
  }

}

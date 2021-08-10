package com.nutrition.nutrition.model;

import java.sql.Date;

public class Record {
  private long id;
  private Date recordDate;
  private Patient patient;

  public Record(long id, Date recordDate, Patient patient){
    this.id = id;
    this.recordDate = recordDate;
    this.patient = patient;
  }

  //Getters
  public long getId(){
    return this.id;
  }

  public Date getRecordDate(){
    return this.recordDate;
  }

  public Patient getPatient(){
    return this.patient;
  }

  //Setters

  public void setId(long id){
    this.id = id;
  }

  public void setRecordDate(Date recordDate){
    this.recordDate = recordDate;
  }

  public void setPatient(Patient patient){
    this.patient = patient;
  }
}

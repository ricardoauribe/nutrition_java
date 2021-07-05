package com.nutrition.nutrition;

public class Patient {

  private long id;
  private String name;

  public Patient(long id, String name){
    this.id = id;
    this.name = name;
  }

  //Getters
  public long getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  //Setters

  public void setId(long id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }


}

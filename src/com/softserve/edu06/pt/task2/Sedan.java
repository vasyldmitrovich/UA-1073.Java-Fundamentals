package com.softserve.edu06.pt.task2;

 class Sedan extends Car {
  public Sedan(String model, int yearOfProduction, int maxSpeed) {
   super(model, yearOfProduction, maxSpeed);
  }

  @Override
  void run() {
   System.out.println("Sedan" + getModel() + "Starts moving");
  }

  @Override
  void stop() {
   System.out.println("Sedan" + getModel() + " Stops");


  }
 }

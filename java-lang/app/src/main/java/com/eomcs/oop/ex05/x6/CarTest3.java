package com.eomcs.oop.ex05.x6;

public class CarTest3 {
public static void main(String[] args) {
 Sedan sedan = new Sedan();
 
 testCar(sedan);
 
 System.out.println("--------------------");
 
 Truck truck = new Truck();
 testCar(truck);
 
 System.out.println("---------------");
 Suv suv = new Suv();
 suv.active4wd(false);
 testCar(suv);
  }
static void testCar(Car car) {
  car.start();
  car.run();
  car.stop();
  }
}

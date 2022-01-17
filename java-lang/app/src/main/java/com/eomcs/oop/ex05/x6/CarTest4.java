package com.eomcs.oop.ex05.x6;

public class CarTest4 {
public static void main(String[] args) {
 
  Sedan sedan = new Sedan();
 SnowChain snowChain = new SnowChain(sedan);
 testCar(snowChain);
 
 System.out.println("-------------");
 Truck truck = new Truck();
 BlackBox blackBox = new BlackBox(truck);
 testCar(blackBox);
 
 System.out.println("-------------");
 Suv suv = new Suv();
 SnowChain snowChain2 = new SnowChain(suv);
 BlackBox blackBox2 =  new BlackBox(snowChain2);

 testCar(blackBox2);
 
}
static void testCar(Car car) {
  car.start();
  car.run();
  car.stop();
  }
}

package com.eomcs.oop.ex05.x6;

public abstract class Car {
  int cc;
  int valve;
  
  public void start() {
    System.out.println("시동 건다!");
  }
  
  public void stop() {
    System.out.println("시동 끈다!");
  }
  
  // run이 Sedan과 Truck에서 다르가 작용하기 때문에 
  // Car에서 기능을 구현하지 않는다.
  public abstract void run();
}    

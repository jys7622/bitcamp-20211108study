package com.eomcs.oop.ex05.x6;

public class Suv extends Car {

 boolean enabled4wd;
 
  
  @Override
  public void start() {
    System.out.println("Suv 시동이 달달 걸린다");
  }
  
  @Override
  public void run() {
    if (enabled4wd) {
      System.out.println("Suv 강력한 파워로 달린다!");
    } else {
    System.out.println("Suv 그냥달린다");
    }
  } 
  
 public void active4wd(boolean enable) {
   this.enabled4wd = enable;
 }
}

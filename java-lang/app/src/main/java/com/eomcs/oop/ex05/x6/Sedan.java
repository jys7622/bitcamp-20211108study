package com.eomcs.oop.ex05.x6;

public class Sedan extends Car {

  boolean auto;
  boolean openedSunroof;
  
  @Override
  public void start() {
    System.out.println("세단 시동이 달달 걸린다");
  }
  @Override
  public void run() {
    System.out.println("세단 덜덜덜덜 달린다");
  }
  
  public void openSunroof() {
    System.out.println("선루프가 위잉 열린다");
    this.openedSunroof = true;
  }
  
  public void closeSunroof() {
    System.out.println("선루프가 위잉 닫힌다");
    this.openedSunroof = false;
  }

}

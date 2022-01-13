package com.eomcs.oop.ex05.x5;

public abstract class Option extends Car {
  
  Car car;
  
  public Option(Car car) { //생성자에서 어떤 자동차에 붙일건지 자동차 주소를 받아야함.
    this.car = car;
  }
}

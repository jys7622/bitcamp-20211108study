package com.eomcs.oop.ex05.x6;

public abstract class Option extends Car{
//Option 클래스는 Car 클래스를 포함한다. Option 클래스는 데코레이터다
  Car car; 

//Option은 스스로 동작x. Option 생성자에서 Car객체를 받아야함.
public Option(Car car) { 
  this.car = car;
  }
}

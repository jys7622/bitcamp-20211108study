package com.eomcs.oop.ex05.x5;

public abstract class Option extends Car {
  
  Car car;
  
  public Option(Car car) { //생성자에서 어떤 자동차에 붙일건지 자동차 주소를 받아야함.
    this.car = car;
  }
  @Override
  public void start() {
  // 데코레이터는 자동차가 아니다.
  // 따라서 시동을 걸라고 요청이 들어오면
  // 실제 자동차 객체에게 위임해야 한다.
    car.start();
  }
@Override
  public void stop() {
  // 데코레이터는 자신이 상속받은 메서드는 버리고 위임해야한다.
  // stop 메서도 요청이 들어오면
  // 실제 자동차 객체에게 위임해야 한다.
    car.stop();
  }
}

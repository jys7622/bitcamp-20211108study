package com.eomcs.oop.ex05.x6;

public class BlackBox  extends Option{
  
  public BlackBox(Car car) {
    super(car);
  }
@Override
public void run() {
  // Option 클래스에는 run메서드가 없기 때문에 
  car.run();
  }

 @Override
public void start() {
// Option이 수퍼클래스다. Option클래스에서 car.start를 호출.
 super.start();
 System.out.println("녹화시작");
 }
 
@Override
public void stop() {
  super.stop();
  System.out.println("녹화 종료!");
  }
}

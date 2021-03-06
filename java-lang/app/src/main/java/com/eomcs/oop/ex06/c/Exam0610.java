// 오버라이딩(overriding) - 리턴 타입
package com.eomcs.oop.ex06.c;

public class Exam0610 {

  static class Car {}
  static class Sedan extends Car {}
  static class Tico extends Sedan {}

  static class CarFactory {
    Car create() {
      return new Car();
    }
  }

  static class SedanFactory extends CarFactory {
    // 오버라이딩 메서드의 리턴 타입은 
    // 서브 클래스도 가능하다.
    @Override
    Sedan create() {
      return new Sedan(); // 수퍼 클래스와 리턴 타입이 달라도 오버라이딩이 가능하다.(서브클래스인 경우만)
    }
  }

  static class TicoFactory extends SedanFactory {
    // 오버라이딩 메서드의 리턴 타입은 
    // 서브 클래스도 가능하다.
    // 리턴 타입(클래스)이 달라도 오버라이딩이 가능한가?
    // 서브 타입(클래스)인 경우만 가능
    @Override
    Tico create() {
      return new Tico();
    }
  }


  public static void main(String[] args) {

  }
}









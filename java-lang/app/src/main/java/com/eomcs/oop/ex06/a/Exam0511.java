// 다형성 - 다형적 변수와 instanceof 연산자
package com.eomcs.oop.ex06.a;

public class Exam0511 {

  public static void main(String[] args) {
    Vehicle v = new Sedan();

    // getClass() ?
    // => 레퍼런스가 가리키는 인스턴스의 실제 클래스 정보를 리턴한다.
    // => == 연산자를 사용하여 특정 클래스의 인스턴스인지 좁혀서 검사할 수 있다.
    //
    // 클래스명.class
    // => 클래스 정보를 갖고 있는 스태틱 변수이다.
    //
    System.out.println(v.getClass() == Sedan.class); // class는 Static변수이다.(built in 변수 - 내장변수) => Sedan클래스의 정보만 특정해서 검사.
    System.out.println(v.getClass() == Car.class); // getClass는 모든 인스턴스는 클래스 정보를 가지고 있다. 
    System.out.println(v.getClass() == Vehicle.class); // 나머지는 Sedan 클래스정보가 없기 때문에 false
    System.out.println(v.getClass() == Truck.class);
    System.out.println(v.getClass() == Bike.class);
  }

}





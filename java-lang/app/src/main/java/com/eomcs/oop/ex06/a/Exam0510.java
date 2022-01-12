// 다형성 - 다형적 변수와 instanceof 연산자
package com.eomcs.oop.ex06.a;

public class Exam0510 {

  public static void main(String[] args) {
    Vehicle v = new Sedan(); // 세단은 Car의 서브 타입
    
    // instanceof 연산자?
    // => 레퍼런스에 들어있는 주소가 특정 클래스의 인스턴스인지 검사한다.
    // => 또는 그 하위 클래스의 인스턴스인지 검사한다.
    //
    System.out.println(v instanceof Sedan); //v에는 Sedan 인스턴스 주소가 들어있다.
    System.out.println(v instanceof Car);
    System.out.println(v instanceof Vehicle);
    System.out.println(v instanceof Object);
    
    System.out.println(v instanceof Truck); // Truck 은 Sedan의 상위, 하위 클래스 둘다 아니기 때문에 false
    System.out.println(v instanceof Bike); // Bike는 Sedan의 상위, 하위 클래스 둘다 아니기 때문에 false
  }

}





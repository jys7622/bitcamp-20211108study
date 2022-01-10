package com.eomcs.oop.ex05.x1.test2;

//  기능 추가 :
//  - 곱하기 계산 기능을 수행
// 해결책
//  - 기존 코드에 곱하기 기능을 추가한다.

public class CalculatorTest {
  public static void main(String[] args) {
    com.eomcs.oop.ex05.x1.test1.Calculator c = new com.eomcs.oop.ex05.x1.test1.Calculator();
    
    c.plus(100); //인스턴스 메서드는 클래스이름으로 호출불가, 인스턴스 주소를 줘야함
    c.minus(200);
    c.multiple(2); // 기존 클래스에 새로 추가한 메서드를 호추한다.
    System.out.println(c.result);
  }
}

// 새 기능을 추가하기 위해 기존 코드를 변경하는 방식의 문제점
// 1) 기존코드에 새 기능 추가하거나 변경하는 경우, 없던 오류가 발생할 수 있다. 



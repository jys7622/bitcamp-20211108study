package com.eomcs.oop.ex05.x1.test1;

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    
    c.plus(100); //인스턴스 메서드는 클래스이름으로 호출불가, 인스턴스 주소를 줘야함
    c.minus(200);
    
    System.out.println(c.result);
  }
}

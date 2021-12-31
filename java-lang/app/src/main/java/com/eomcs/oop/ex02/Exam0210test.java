package com.eomcs.oop.ex02;

// # 관련된 기능(메서드)을 묶어 분류하기 : 분류 전
//
public class Exam0210test {
  static class Calculator {
    static int result = 0;
    
    static int plus(int a, int b) {
      return a + b;
    }

    static int minus(int a, int b) {
      return a - b;
    }

    static int multiple(int a, int b) {
      return a * b;
    }

    static int divide(int a, int b) {
      return a / b;
    }
  }

  public static void main(String[] args) {


    result = Calculator.plus(2, 3);
    result = Calculator.minus(result, 1);
    result = Calculator.multiple(result, 7);
    result = Calculator.divide(result, 3);

    System.out.printf("result = %d\n", result);
  }

  
}



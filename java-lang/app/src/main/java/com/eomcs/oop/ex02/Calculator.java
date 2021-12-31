package com.eomcs.oop.ex02;

class Calculator {

  int result = 0;

//int result라는 인스턴스 변수를 사용하기 때문에 non-static변수로 만들었다.
  void plus(int value) {
    this.result += value;
  }

  void minus(int value) {
    this.result -= value;
  }

  void multiple(int value) {
    this.result *= value;
  }

  void divide(int value) {
    this.result /= value;
  }

  
  // 인스턴스를 사용하지 않는 메서드라면 그냥 클래스 메서드로 두어라.
  static int abs(int a) {
    return a >= 0 ? a : a * -1;
  }
}

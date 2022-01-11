// 기존 코드를 복사하여 새 클래스를 만든 후에 코드를 추가했다.
package com.eomcs.oop.ex05.c;

public class Calculator2 {

  public int result;

  public void plus(int value) {
    this.result += value;
  }

  public void minus(int value) {
    this.result -= value;
  }

  // 새 기능을 기존 클래스에 추가한다.
  // 기존 클래스 Calculator의 코드를 복사하여
  // 새로만든 class Calculator2에 붙이고 새로운 기능은 Calculator2에 추가.
  public void multiple(int value) {
    this.result *= value;
  }

  public void divide(int value) {
    this.result /= value;
  }
}

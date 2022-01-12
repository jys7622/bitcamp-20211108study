// 오버라이딩(overriding) - 오버라이딩과 super 키워드
package com.eomcs.oop.ex06.c;

public class Exam0411 {

  static class A {
    void m() {
      System.out.println("A의 m()");
    }
  }

  static class A2 extends A {

    @Override
    void m() {
      System.out.println("A2의 m()");
    }

    void test() {
      // this 레퍼런스로 메서드를 호출하면,
      // => 현재 클래스(this에 넘어온 주소,this의 실제 클래스. 예 : A2)에서 메서드를 찾아 호출한다.
      // => 현재 클래스에 메서드가 없으면 수퍼 클래스에서 메서드를 찾는다.
      // => 메서드를 찾을 때까지 최상위 클래스까지 따라 올라간다.
      this.m();

      // super 레퍼런스로 메서드를 호출하면,
      // => 수퍼 클래스(메서드가 소속된 클래스의 수퍼 클래서 예 A)에서 메서드를 찾아 호출한다.
      // => 수퍼 클래스에 없으면 그 상위 클래스로 따라 올라간다.
      // => 오버라이딩 하기 전의 메서드를 호출하고 싶을 때 유용하다.
      super.m();
    }
  }

  static class A3 extends A2 {
    @Override
    void m() {
      System.out.println("A3의 m()");
    }
  }
  
  public static void main(String[] args) {
    A3 obj = new A3();
    obj.test(); 
    // A2의 test() 호출. test는 A2의 메서드이지만
    // A3 객체를 만들어서 호출했기 때문에 this.m()은 현재 this에 넘어온 객체 주소인 A3의 m()를 호출한 것이다.
    // 하지만 super()는 A의 m()을 호출한다. 
    // super() 명령어는 test() 메서드가 소속된 클래스(A2)의 super 클래스를  호출했기 때문이다.
    
    }
}








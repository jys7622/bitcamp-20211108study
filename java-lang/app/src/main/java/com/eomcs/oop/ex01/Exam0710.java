package com.eomcs.oop.ex01;

// # import : 사용 전
//
public class Exam0710 {
  public static void main(String[] args) {

    // 다른 패키지의 클래스 사용
    // => 패키지 이름을 항상 붙여야 한다.
    //    그래야만 컴파일러가 해당 클래스를 찾을 수 있다.
    // 같은 패키지가 아니면 다른패키지에있는 클래스를 사용할 때는 
    // 앞에 패키지명 전체를 명확하게 명시해야 한다.     
    // sub와 Exam0710 모두 ex01에 소속되어있지만 패키지명을 모두 적어줘야한다.
    // ex) sub.Y2 obj = new sub.Y2() -> 에러
    com.eomcs.oop.ex01.sub.Y2 obj;
    obj = new com.eomcs.oop.ex01.sub.Y2();

  }
}

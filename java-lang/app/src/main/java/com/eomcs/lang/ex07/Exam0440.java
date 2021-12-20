package com.eomcs.lang.ex07;

//# 메서드 : 스택 메모리 응용 I
//
public class Exam0440 {

  static int m1(int value) {
    int r1 = m2(value);  
// m1메서드 호출시 JVM Stack에 로컬변수 생성, 변수 자체를 직접 r1에 넣는 것이 아니라 변수 안에 있는 값 value를 넣는것
    int r2 = m3(value);  
// m1메서드 호출시 JVM Stack에 로컬변수 생성 
    return r1 + r2;
  }

  static int m2(int value) {
    return value + 100;
  }

  static int m3(int value) {
    return value + 200;
  }

  public static void main(String[] args) {
    int r = m1(5);
    System.out.println(r);
  }
}
// JVM Stack 메모리의 사용
// 0) 시작
// 1) main()
// 2) main() => m1() - 함수의 파라미터도 로컬변수이기 때문에 args도 로컬변수.
// 3) main() => m1() => m2()
// 4) main() => m1()
// 5) main() => m1() => m3()
// 6) main() => m1()
// 7) main()
// 8) 종료!
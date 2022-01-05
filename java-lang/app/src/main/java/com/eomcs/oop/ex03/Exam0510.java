// 변수 자동 초기화 - 스태틱 변수
package com.eomcs.oop.ex03;

import java.sql.Date;

public class Exam0510 {
  //스태틱 클래스가 로딩될 때 메서드 에어리어에 스태틱 변수가 만들어진다
  // 한번 로딩되면 다시 로딩되지 않는다
  static class A {
    static byte b;
    static short s;
    static int i;
    static long l;
    static char c;
    static float f;
    static double d;
    static boolean bool;
    static String str;
    static Date date;
  }

  public static void main(String[] args) {

    // 클래스 변수(스태틱 변수)는 생성되는 순간 0으로 자동 초기화 된다.
    // => 정수(byte, short, int, long, char) : 0
    // => 부동소수점(float, double) : 0.0 = 0
    // => 논리(boolean) : false = 0
    // => 레퍼런스: null = 0
    // 
    System.out.printf("%d, %d, %d, %d, %c, %.1f, %.1f, %b, %s, %s\n", 
        A.b, A.s, A.i, A.l, A.c, A.f, A.d, A.bool, A.str, A.date);
    int x = 0;
    // 로컬 변수는 자동으로 초기화되지 않는다.
    // 사용하기 전에 반드시 초기화시켜야 한다.
    // 초기화시키지 않고 사용하면 컴파일 오류 발생.
    // 꼭 0으로 초기화시킬 필요는 없다. 변수를 만든 후 처음에 어떤 값으로 시작할 지  개발자의 결정.
    System.out.println(x); //-> 컴파일 에러
  }
}



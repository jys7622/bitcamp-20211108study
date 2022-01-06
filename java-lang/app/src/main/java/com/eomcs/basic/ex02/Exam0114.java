// String - String 인스턴스를 상수풀에 생성하기: intern()
package com.eomcs.basic.ex02;

public class Exam0114 {
  public static void main(String[] args) {

    String s1 = new String("Hello"); // Heap 영역에 String 인스턴스를 생성한다.

    // 먼저 상수풀에 String 객체를 생성해보자.
    String s2 = "Hello"; // String Pool 영역에 String 인스턴스를 생성한다.

    // intern()
    // - String 객체에 들어 있는 문자열과 동일한 문자열을 갖고 있는 String 객체를 상수풀에서 찾는다.
    // - 있으면 그 String 객체의 주소를 리턴한다.
    // - 없으면 상수풀에 String 객체를 생성한 후 그 주소를 리턴한다.
    String s3 = s1.intern();

    System.out.println(s1 == s2); // s1 == s2에 할당된 주소값이 다르기 때문에 false
    System.out.println(s2 == s3); // true
  }
}



package com.eomcs.oop.ex05.x1.test5;

//  기능 추가 :
//  - 곱하기 계산 기능을 수행
// 해결책
//  - 기존 Calculator 클래스와 연결한 후 위임을 통해 

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2();
    
    c.plus(100); //인스턴스 메서드는 클래스이름으로 호출불가, 인스턴스 주소를 줘야함
    c.minus(200);
    c.multiple(2);
    
    System.out.println(c.getResult());
  }
}
// 위임(delegation)
// - 상속은 문법적으로 기능을 확장하기 때문에 코드가 경직되어 있다.
//  => 다음과 같이 클래스가 계층을 이루고 있다고 가정한다.
//     A <-- B <-- C
//     즉 B는 A를 상속, C는 B를 상속받음.(A의 서브 클래스 B, B의 서브 클래스 C)
//     C의 기능이 필요한 D는 다음과 같이 C를 상속받을 것이다.
//     C <-- D
//     여기서 D는 B의 기능이 필요 없어도, 어쩔 수 없이 상속 받아야함
//     C가 B를 상속 받기 때문이다. -> 코드 경직의 의미.
//     필요없는 기능을 자유롭게 뺄 수 없다.(유연성 부족)


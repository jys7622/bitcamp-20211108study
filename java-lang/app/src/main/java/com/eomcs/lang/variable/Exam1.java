



package com.eomcs.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable") //클래스 이름이 같을 때 충돌 방지
@RequestMapping("/lang/variable/exam1")
public class Exam1 {
  
  @GetMapping("/test1")
  public String test1(String name, String tel, String gender) {
    return "클라이언트에서 받은 값 = " +name + "," + tel + ","+ gender;
  }
}
  
 



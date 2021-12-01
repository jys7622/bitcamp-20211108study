//literal : 부동소수점 리터럴과 값의 범위

package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam3")

public class Exam4 {

  @GetMapping("/test1")
  public String test1() {
    //return "정수 : " + 21_4748_3648; //컴파일 오류! 4바이트 메모리에 저장할 수 없다. (최대값을 초과했기 때문)  
    return "정수 : " + 21_4748_3647;  
} 
  }


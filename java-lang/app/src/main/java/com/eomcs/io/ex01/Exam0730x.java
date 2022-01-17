// 활용 - 지정한 폴더에서 .class 파일만 찾아 출력하라.
package com.eomcs.io.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam0730x {

  public static void main(String[] args) throws Exception {

    File dir = new File("bin/main");
   
    System.out.println(dir.getCanonicalPath());

    printClasses(dir);
  }
//메인이 static 멤버이기때문에 static으로 호출
  // File 객체를 선언했기 때문에 메서드 호출시에도 File 객체를 파라미터로 받는다.
  static void printClasses(File dir) { 
    //현재 디렉토리에서 파일 목록 불러오는 배열
    File[] files = dir.listFiles();
    for (File f :files) {
      if(f.isFile() && f.getName().endsWith(".class")) {
        System.out.println(f.getName());
      } else if(f.isDirectory()){
        
        printClasses(f);
      }
    }
  }

}



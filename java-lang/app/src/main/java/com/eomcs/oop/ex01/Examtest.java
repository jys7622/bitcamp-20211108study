package com.eomcs.oop.ex01;

 class Examtest {
   static class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
   }
    public static void main(String args[]) {
      Score s = createScore("홍범도",100, 90, 80);
      printScore(s);
    
    }
    static Score createScore(String name, int kor, int eng, int math) {
      Score s = new Score();
     
      s.name = name;
      s.kor = kor;
      s.eng = eng;
      s.math = math;
      s.sum = s.kor + s.eng + s.sum;
      s.aver = s.sum/3;
      return s;
    }
    static void printScore(Score s) {
      System.out.printf("%s : %d, %d, %d, %d, %.1f", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    }
 }
  


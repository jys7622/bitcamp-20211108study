package com.eomcs.io.ex15;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Exam120 {
  public static void main(String[] args) throws Exception{
   
    Decoder decoder = Base64.getDecoder();
    
    FileReader in = new FileReader("./temp/서현진.txt");
    FileOutputStream out = new FileOutputStream("./temp/서현진2.jfif");
    
    char[] buf = new char[1000000];
    int len = in.read(buf); 
    System.out.printf("읽은 문자 수 : %d\n", len);
    // 문자 배열에 저장된 base64텍스트를 바이너리 데이터로 변환하기
      
    byte[] decodedBytes = decoder.decode(String.valueOf(buf, 0, len));
      
      
    // 텍스트로 변환된 데이터를 파일로 출력하기
    out.write(decodedBytes);
    
    in.close();
    out.close();
  }
}

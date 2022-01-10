package com.eomcs.io;

import java.io.FileReader;

// 기존 코드를 자신의 코드처럼 사용하기 위해 기해당 클래스를 포함한다.
public class FileReader2 {
  
 // 기존의 클래스 포함 ! 
  FileReader in;
  
  public FileReader2(String filename) throws Exception{
    // 기존 객체를 준비한다.
    in = new FileReader(filename);
    }
  public String readLine() throws Exception{
    StringBuilder buf = new StringBuilder();
    int c;
    
    // 입력을 수행하기 위해 이 클래스가 포함하고 있는 기존 객체를 이용한다.
    while ((c = in.read()) != -1) {// 파일에서 한 문자를 읽는다. 더이상 읽을 문자가 없으면 반복문을 종료하다.
      if (c == '\n') { // 만약 읽은 문자가 줄바꿈 명령이라면, 지금까지 버퍼에 저장한 문자를 리턴한다.
        return buf.toString(); //엔터를 만나면 지금까지 버퍼에 저장한 걸 리턴
      } else if (c =='\r') {
        // 무시! CR(Carrage Return; \r) 코드는 버퍼에 담지 말고 버린다.
      } else { // 문자를 읽을 때 마다 버퍼이 임시 보관한다.
        buf.append((char) c); //준비한 buf에다가 읽은 문자를 하나씩 추가한다
      }
    }
    return buf.toString();
  }
  // 자원 해제하라는 요청이 들어오면 실제 일을 하는 객체에게 전달한다.
  public void close() throws Exception{
    in.close();
  }
}

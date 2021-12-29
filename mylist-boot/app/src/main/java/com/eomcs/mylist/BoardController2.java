package com.eomcs.mylist;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BoardController2 {
  ArrayList boardList = new ArrayList();

  @RequestMapping("/board2/list")
  public Object list() {
    return ArrayList.toArray(boardList); 
  }

  @RequestMapping("/board2/add")
  public Object add(Board board) {
    board.setCreatedDate(new Date(System.currentTimeMillis()));
    ArrayList.add(boardList, board);
    return boardList.size;
  }


  @RequestMapping("/board2/get")
  public Object get(int index) {
    if (index < 0 || index >= boardList.size) {
      return "";
    }
    //Board 객체는 Object객체를 가리키지 못하기 때문에 (Board)를 붙인다.
    Board board = (Board) boardList.list[index]; 
    board.viewCount++;
    return board;
  }

  @RequestMapping("/board2/update")
  // 클라이언트가 인덱스란 이름으로 업데이트할 게시물의 
  // 번호를 보내면, 그걸 파라미터로 넘겨줘, 나머지는 Board타입의 
  // board객체에 담아서 줘.
  public Object update(int index, Board board) {
    if (index < 0 || index >= boardList.size) {
      return 0;
    }
    //  2)그래서 기존객체를 가져온다.
    Board old = (Board) boardList.list[index];
    //  3)새로운 객체 조회수에 기존 조회수를 복사한다.
    board.viewCount = old.viewCount;
    //  4)새로운 객체 날짜에 기존 조회수를 복사한다.
    board.createdDate = old.createdDate;
    // 1)기존객체인 index를 버리고 새객체인 board를 넣는것이기 때문에
    //  조회수, 날짜가 업데이트 되지 않는다.
    return ArrayList.set(boardList,index, board) == null ? 0 : 1;
  }

  @RequestMapping("/board2/delete")
  public Object delete(int index) {
    if (index < 0 || index >= boardList.size) {
      return 0;
    }
    return ArrayList.remove(boardList,index) == null ? 0 :1;
  }
}






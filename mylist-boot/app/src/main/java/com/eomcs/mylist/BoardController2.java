package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.Date;
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
  public Object update(int index, Board board) {
    if (index < 0 || index >= boardList.size) {
      return 0;
    }
    Board old = (Board) boardList.list[index];
    board.viewCount = old.viewCount;
    board.createdDate = old.createdDate;
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






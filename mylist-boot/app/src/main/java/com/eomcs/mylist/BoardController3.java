package com.eomcs.mylist;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BoardController3 {

  @RequestMapping("/board3/list")
  public Object list() {
    return ArrayList5.toArray(); 
  }

  @RequestMapping("/board3/add")
  public Object add(Board board) {
    board.setCreatedDate(new Date(System.currentTimeMillis()));
    ArrayList5.add(board);
    return ArrayList5.size;
  }


  @RequestMapping("/board3/get")
  public Object get(int index) {
   if ( index < 0 || index >= ArrayList5.size) {
      return "";
    }
    Board board = (Board) ArrayList5.list[index];
    board.viewCount++;
    return board;
  }

  @RequestMapping("/board3/update")
  public Object update(int index,Board board) {
    if (index < 0 || index >= ArrayList5.size) {
      return 0;
    }
    
    Board old = (Board) ArrayList5.list[index];
    board.viewCount = old.viewCount;
    board.createdDate = old.createdDate;
    return ArrayList5.set(index, board) == null ? 0 : 1;
  }

  

  @RequestMapping("/board3/delete")
  public Object delete(int index) {
//    if (index < 0 || index >= ArrayList5.size) {
//      return 0;
//    }
   return ArrayList5.remove(index) == null ? 0 :1;
    
  }
}




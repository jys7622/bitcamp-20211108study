package com.eomcs.mylist;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BoardController {

  // Board 객체 목록을 저장할 메모리를 준비한다.
  ArrayList boardList = new ArrayList()
      ;
  @RequestMapping("/board/list")
  public Object list() {
    return ArrayList.toArray(boardList); 
  }

  @RequestMapping("/board/add")
  public Object add(Board board) {
    ArrayList.add(boardList,board);
    // 인터넷검색 : 자바에서 날짜 준비하는 코드
    Date date = new Date();
    long timeInMilliSeconds = date.getTime();
    java.sql.Date today = new java.sql.Date(timeInMilliSeconds);

    // 방금 추가한 게시물이 배열의 맨마지막에 있기 때문에 
    // 배열의 맨마지막 것을 선택하여 날짜를 설정해준다
    ((Board) ArrayList.toArray(boardList)[boardList.size - 1]).setCreatedDate(today);
    return boardList.size;
  }

  @RequestMapping("/board/get")
  public Object get(String title) {
    int index = indexOf(title);
    if (index == -1) {
      return "";
    }
    // setViewCount를 통해 서버에 있는 게시물의 viewCount를 하나 올려준다.
    ((Board) boardList.list[index]).setViewCount(((Board)       
        // 서버에서 기존 viewCount를 가져와서 +1 해준다
        boardList.list[index]).getViewCount() + 1);
    return boardList.list[index];
  }

  @RequestMapping("/board/update")
  public Object update(Board board) {
    int index = indexOf(board.title);
    if (index == -1) {
      return 0;
    }

    return ArrayList.set(boardList,index, board) == null ? 0 : 1;
  }

  @RequestMapping("/board/delete")
  public Object delete(String title) {
    int index = indexOf(title);
    if (index == -1) {
      return 0;
    }

    ArrayList.remove(boardList, index);
    return 1; 
  }

  int indexOf(String title) {
    for (int i = 0; i < boardList.size; i++) {
      Board board =  (Board) boardList.list[i];
      if (board.title.equals(title)) { 
        return i;
      }
    }
    return -1;
  }
}




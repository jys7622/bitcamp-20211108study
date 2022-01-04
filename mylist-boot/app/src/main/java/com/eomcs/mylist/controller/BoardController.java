package com.eomcs.mylist.controller;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Board;
import com.eomcs.util.ArrayList;

@RestController 
public class BoardController {
  ArrayList boardList = new ArrayList();

  @RequestMapping("/board/list")
  public Object list() {
    return boardList.toArray(); 
  }

  @RequestMapping("/board/add")
  public Object add(Board board) {
    board.setCreatedDate(new Date(System.currentTimeMillis()));
    boardList.add(board);
    return boardList.size();
  }


  @RequestMapping("/board/get")
  public Object get(int index) {
    if (index < 0 || index >= boardList.size()) {
      return "";
    }
    //Board 객체는 Object객체를 가리키지 못하기 때문에 (Board)를 붙인다.
    Board board = (Board) boardList.get(index); 
    board.setViewCount(board.getViewCount() +1);
    return board;
  }

  @RequestMapping("/board/update")
  // 클라이언트가 인덱스란 이름으로 업데이트할 게시물의 
  // 번호를 보내면, 그걸 파라미터로 넘겨줘, 나머지는 Board타입의 
  // board객체에 담아서 줘.
  public Object update(int index, Board board) {
    if (index < 0 || index >= boardList.size()) {
      return 0;
    }
    //  2)그래서 기존객체를 가져온다.
    Board old = (Board) boardList.get(index);
    //  3)새로운 객체 조회수에 기존 조회수를 복사한다.
    board.setViewCount(old.getViewCount());
    //  4)새로운 객체 날짜에 기존 조회수를 복사한다.
    board.setCreatedDate(old.getCreatedDate());
    // 1)기존객체인 index를 버리고 새객체인 board를 넣는것이기 때문에
    //  조회수, 날짜가 업데이트 되지 않는다.
    return boardList.set(index, board) == null ? 0 : 1;
  }

  @RequestMapping("/board/delete")
  public Object delete(int index) {
    if (index < 0 || index >= boardList.size()) {
      return 0;
    }
    return boardList.remove(index) == null ? 0 :1;
  }

}






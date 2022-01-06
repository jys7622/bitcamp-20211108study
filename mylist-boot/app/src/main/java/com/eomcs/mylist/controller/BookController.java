package com.eomcs.mylist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Book;
import com.eomcs.util.ArrayList;

@RestController 
public class BookController {
  ArrayList bookList = new ArrayList();

  public BookController() {
    System.out.println("BookController() 호출됨!");
  }

  @RequestMapping("/book/list")
  public Object list() {
    return bookList.toArray(); 
  }

  @RequestMapping("/book/add")
  public Object add(Book book) {

    bookList.add(book);
    return bookList.size();
  }


  @RequestMapping("/book/get")
  public Object get(int index) {
    if (index < 0 || index >= bookList.size()) {
      return "";
    }
    //Board 객체는 Object객체를 가리키지 못하기 때문에 (Board)를 붙인다.
    Book book = (Book) bookList.get(index); 

    return book;
  }

  @RequestMapping("/book/update")
  // 클라이언트가 인덱스란 이름으로 업데이트할 게시물의 
  // 번호를 보내면, 그걸 파라미터로 넘겨줘, 나머지는 Board타입의 
  // board객체에 담아서 줘.
  public Object update(int index, Book book) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }
    //  2)그래서 기존객체를 가져온다.arr = [{}, {}, {}] arr[1]= {title: hi}
    Book old = (Book) bookList.get(index);
    //  3)새로운 객체 조회수에 기존 조회수를 복사한다.

    //  4)새로운 객체 날짜에 기존 날짜를 복사한다.

    // 1)기존객체인 index를 버리고 새객체인 board를 넣는것이기 때문에
    //  조회수, 날짜가 업데이트 되지 않는다.
    return bookList.set(index, book) == null ? 0 : 1;
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }
    return bookList.remove(index) == null ? 0 :1;
  }

}






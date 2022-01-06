package com.eomcs.mylist.domain;
// 다른 패키지에서도 이 클래스 쓰게하려면 public붙여서 공개함.

import java.sql.Date;

public class Book {
  String title; // 제목
  String author; // 작가
  String press; // 출판사
  int page; // 총 페이지
  int price; // 가격
  Date readDate; // 읽은 날짜
  String feed; // 독후감
  
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getPress() {
    return press;
  }
  public void setPress(String press) {
    this.press = press;
  }
  public int getPage() {
    return page;
  }
  public void setPage(int page) {
    this.page = page;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public Date getReadDate() {
    return readDate;
  }
  public void setReadDate(Date readDate) {
    this.readDate = readDate;
  }
  public String getFeed() {
    return feed;
  }
  public void setFeed(String feed) {
    this.feed = feed;
  }
 
}

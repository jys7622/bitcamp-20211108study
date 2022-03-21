package com.eomcs.mylist.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.eomcs.mylist.dao.ContactDao;
import com.eomcs.mylist.domain.Contact;
import com.eomcs.mylist.domain.ContactTel;

public class ContactService {
  @Autowired
  ContactDao contactDao;
  public int add(Contact contact) {
    contactDao.insert(contact);
    for (ContactTel tel : contact.getTels()) {
      tel.setContactNo(contact.getNo()); // 전화번호 입력 전에 자동 생성된 연락처 번호를 설정한다.
      contactDao.insertTel(tel);
    }
    return 1;
  
  }
  public List<Contact> List() {
    List<Contact> contacts = contactDao.findAll();
    for (Contact contact : contacts) {
      contact.setTels(contactDao.findTelByContactNo(contact.getNo()));
    }
    return contacts;
    
  }
}

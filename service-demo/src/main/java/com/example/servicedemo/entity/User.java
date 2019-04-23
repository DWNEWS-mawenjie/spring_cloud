package com.example.servicedemo.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @ClassName User
 * @Author mawenjie
 * @Date 2019-04-11 17:55
 **/
@Document(collection = "users")
public class User implements Serializable {
  @Id
  String id;
  String userName;
  String picture;



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}

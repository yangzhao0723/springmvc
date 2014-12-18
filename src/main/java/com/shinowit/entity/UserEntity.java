package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/12/17.
 */
@Entity
@Table(name = "user")
public class UserEntity {
    private String username;
    private Integer id;
    private String userpass;

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userpass")
    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }


}


package com.phanxuannam.shoesshop.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class UsersEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String name;
    private String birthday;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId")
    private UserRoleEntity userRoles;

    public UsersEntity() {
    }

    public UsersEntity(int userId, String username, String name, String birthday, UserRoleEntity userRoles) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.birthday = birthday;
        this.userRoles = userRoles;
    }

    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public UserRoleEntity getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoleEntity userRoles) {
        this.userRoles = userRoles;
    }
    
    
}

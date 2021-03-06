package com.banana.model;
// Generated Nov 22, 2017 12:40:03 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer idUser;
     private String firtsName;
     private String lastName;
     private String email;
     private String password;
     private String code;
     private String area;
     private Byte active;
     private Set userHasRoles = new HashSet(0);

    public User() {
    }

    public User(String firtsName, String lastName, String email, String password, String code, String area, Byte active, Set userHasRoles) {
       this.firtsName = firtsName;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
       this.code = code;
       this.area = area;
       this.active = active;
       this.userHasRoles = userHasRoles;
    }

    public User(String firtsName, String lastName, String email, String password) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getFirtsName() {
        return this.firtsName;
    }
    
    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    public Byte getActive() {
        return this.active;
    }
    
    public void setActive(Byte active) {
        this.active = active;
    }
    public Set getUserHasRoles() {
        return this.userHasRoles;
    }
    
    public void setUserHasRoles(Set userHasRoles) {
        this.userHasRoles = userHasRoles;
    }




}



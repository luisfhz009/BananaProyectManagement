package com.banana.model;
// Generated Nov 22, 2017 12:40:03 PM by Hibernate Tools 4.3.1



/**
 * UserHasRole generated by hbm2java
 */
public class UserHasRole  implements java.io.Serializable {


     private UserHasRoleId id;
     private Proyect proyect;
     private Role role;
     private Task task;
     private User user;
     private byte active;

    public UserHasRole() {
    }

    public UserHasRole(UserHasRoleId id, Proyect proyect, Role role, Task task, User user, byte active) {
       this.id = id;
       this.proyect = proyect;
       this.role = role;
       this.task = task;
       this.user = user;
       this.active = active;
    }
   
    public UserHasRoleId getId() {
        return this.id;
    }
    
    public void setId(UserHasRoleId id) {
        this.id = id;
    }
    public Proyect getProyect() {
        return this.proyect;
    }
    
    public void setProyect(Proyect proyect) {
        this.proyect = proyect;
    }
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    public Task getTask() {
        return this.task;
    }
    
    public void setTask(Task task) {
        this.task = task;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }




}



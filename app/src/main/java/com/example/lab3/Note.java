package com.example.lab3;

public abstract class Note {
    //Attribute
    public String title;
    public String createdDate;
    public User owner;
    //getter method
    public String getTitle(){
        return title;
    }
    public String getCreatedDate(){
        return createdDate;
    }
    public User getUser(){
        return owner;
    }
    //setter method
    public void setTitle(String newTitle){
        this.title = newTitle;

    }
    public void setCreatedDate(String newCreatedDate){
        this.createdDate=newCreatedDate;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    //Method
    abstract public String  getSummary();

    //System.out.println(title+":"+content+"("+createdDate+")");

}

package com.example.lab3;

public class Note {
    //Attribute
    String title;
    String content;
    int createdDate;
    //Method
    void getSummary(){
        System.out.println(title);
        System.out.println(content);
        System.out.println(createdDate);
        //System.out.println(title+":"+content+"("+createdDate+")");
}
}

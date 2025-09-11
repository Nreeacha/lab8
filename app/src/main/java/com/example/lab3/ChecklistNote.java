package com.example.lab3;

import java.util.List;

public class ChecklistNote extends Note{
    //Attribute
    private List<String> items;
    public ChecklistNote(String title, String createdDate, List<String> items) {
        this.title = title;
        this.createdDate = createdDate;
        this.items = items;
    }

    public ChecklistNote() {

    }

    //getter method
    public List<String>getItems(){
        return items;
    }

    //setter method
    private void setItems(List<String> newItems){
        this.items = newItems;
    }
    public String  getSummary(){
       // String strItem = //loop for get data from List
       // return title+":"+textContent+"("+createdDate+")";
         return title+":"+"("+createdDate+")";
    }


}

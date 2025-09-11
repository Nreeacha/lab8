package com.example.lab3;

public class TextNote extends Note{
    //Attribute
    private  String textContent;

    public TextNote(String title, String createdDate, String content) {
        this.title = title;
        this.createdDate = createdDate;
        this.textContent = content;
    }

    public TextNote() {

    }

    //getter method
    public String getTextContent(){
         return textContent;
     }

    //setter method
public void setTextContent(String newContent){
        this.textContent = newContent;


}


    //Method
   public String  getSummary(){
        return title+":"+textContent+"("+createdDate+")";
        //System.out.println(title+":"+content+"("+createdDate+")");
    }
}

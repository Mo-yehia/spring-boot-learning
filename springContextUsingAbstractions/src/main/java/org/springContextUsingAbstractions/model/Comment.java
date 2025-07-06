package org.springContextUsingAbstractions.model;


//This class serves as a simple data model used throughout the app.
public class Comment {
    private String Author;
    private String text;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

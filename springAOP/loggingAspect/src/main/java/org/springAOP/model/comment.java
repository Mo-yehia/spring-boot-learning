package org.springAOP.model;

public class comment {
    private String Author;
    private String text;

    public comment(String author, String text) {
        Author = author;
        this.text = text;
    }

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

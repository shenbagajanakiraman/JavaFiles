package com.stackroute.sp.editor;
class Text {

    private String text;
    private String author;
    private int length;

    public Text(String text, String author, int length) {
        this.text = text;
        this.author = author;
        this.length = length;
    }

    public String getText()

    {
        return text;
    }

    public String getAuthor()
    {

        return author;
    }

    public int getLength()
    {

        return length;
    }
}





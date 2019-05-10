package com.stackroute.sp;
class Text {
    private String text;
    private String author;
    private int length;

    public Text(String text, String author, int length) {
        this.text = text;
        this.author = author;
        this.length = length;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }
}

class ChangeCase extends Text {

    public ChangeCase(String text, String author, int length) {
        super(text, author, length);
    }
    void allLettersToUpperCase(TextOutput myText){
        System.out.println("\nTo upper case...");

        System.out.println(myText.getText().toUpperCase());



    }
}

class DeleteSubText extends ChangeCase {

    public DeleteSubText(String text, String author, int length) {
        super(text, author, length);
    }
    void findSubTextAndDelete(TextOutput myText, String s) {

        System.out.println("\nRemoving string "+s);
        System.out.println(myText.getText().replace("the",""));

    }

}

class TextOutput extends DeleteSubText {

    public TextOutput(String text, String author, int length) {
        super(text, author, length);
    }

    void printText(TextOutput myText) {

        System.out.println("Printing values......");

        System.out.println("Text : "+myText.getText());
        System.out.println("Author : "+myText.getAuthor());
        System.out.println("Length : "+myText.getLength());

    }

}





public class EditorDemo {
    public static void main(String[] args) {

        TextOutput myText = new TextOutput("Even through the cracks, the light enters...","Gargi",1);

        myText.printText(myText);
        myText.allLettersToUpperCase(myText);
        myText.findSubTextAndDelete(myText,"the");



    }
}

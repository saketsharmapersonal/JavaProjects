package org.example.lld.flyweightDesign;

public class DocumentCharacter implements ILetter{
    private char character;
    private String fontType;
    private int Size;

    DocumentCharacter(char character, String fontType, int size){
        this.character=character;
        this.fontType=fontType;
        this.Size=size;
    }
    @Override
    public void display(int row, int column) {

    }
}

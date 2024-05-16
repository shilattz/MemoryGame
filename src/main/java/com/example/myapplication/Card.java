package com.example.myapplication13;

public class Card {
    public static final int EMPTY = 0;
    public static final int X = 1;
    public static final int O = 2;
    String id;
    int status;//0 - empty, 1 - X, 2 - O
    int row;
    int col;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Card(String id, int status, int row, int col) {
        this.id = id;
        this.status = status;
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        String str = " ";
        if(status == X){
            str = "X";
        }else if(status == O){
            str = "O";
        }
        return  str;
    }
}

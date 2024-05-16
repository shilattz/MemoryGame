package com.example.myapplication13;

public class Game {
    public static final int SIZE = 3;
    Card[][] board;
    int turn;
    int counter;

    public Game() {
        start_game();
    }

    public void start_game() {
        board = new Card[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new Card("" + i + "," + j, Card.EMPTY, i, j);
            }
        }
        turn = Card.X;
        counter = 0;
    }

    public int step(int row, int col) { //returns 0- success, 1 - not empty, 2- if finish with winner, 3 - finish without winner
        //set x/o on card
        if (board[row][col].getStatus() != Card.EMPTY) {
            return 1;
        }
        if (counter == SIZE * SIZE) return 3;
        board[row][col].setStatus(turn);
        counter++;

        if (checkIfWin()) {
            return 2;
        }
        //opdate turn
        turn = (turn == Card.X) ? Card.O : Card.X;
        return 0;
    }

    private boolean checkIfWin() {
        return false;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                str += board[i][j].toString() + ", ";
            }
            str += "\n-------------------\n";
        }
        return str;
    }
    public String getTurn(){
        return turn == Card.X ? "X" :"O";
    }
}

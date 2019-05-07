package com.stackroute.pe3;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessPattern = new String[8][8];
        String str1 = "WW";
        String str2 = "BB";
        String temp;

        for(int i = 0; i < 8 ; i++){
            for ( int j = 0 ; j < 8 ;j++) {
                if( j % 2 == 0) {
                    chessPattern[i][j] = str1;
                }
                else {
                    chessPattern[i][j] = str2;
                }

            }
            temp = str1;
            str1 = str2;
            str2 = temp;

        }

        System.out.println("Printing Chessboard Pattern.....");


        for(int i = 0; i < 8 ; i++) {

            System.out.println("");

            for (int j = 0; j < 8; j++) {
                System.out.print(chessPattern[i][j]+"|");

            }
        }

    }
}

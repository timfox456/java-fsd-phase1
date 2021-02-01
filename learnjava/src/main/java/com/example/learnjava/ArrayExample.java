package com.example.learnjava;

public class ArrayExample {

    private int checkerboard[][] = new int[8][8];


    public ArrayExample() {
        initializeArray();
    }

    private void initializeArray()
    {
        for(int i = 0; i < 8; i ++) {
            for (int j = 0; j < 8; j++) {
                checkerboard[i][j] = 0;
            }
        }
    }

    private void setupGame()
    {
        for(int i = 0; i < 8; i ++) {
            for (int j = 0; j < 8; j++) {
                if ((i < 3) && (i+j)% 2 == 0) {
                    checkerboard[i][j] = 1;
                } else if ((i > 4) && (i+j)% 2 == 0) {
                    checkerboard[i][j] = 2;
                }

            }
        }
    }


    private void printBoard()
    {
        System.out.println("Board:");

        for(int i = 0; i < 8; i ++) {
            StringBuffer buffer = new StringBuffer("");
            for (int j = 0; j < 8; j++) {
                buffer.append(" " + String.valueOf(checkerboard[i][j]) + " ");

            }
            System.out.println(buffer.toString());
        }
    }

    public void TestArrays()
    {
        // empty space = 0
        // black occupied = 1
        // red occupied = 2
        setupGame();
        printBoard();
    }




}

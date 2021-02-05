package com.example.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

    public void RotateArray(int[] nums, int k)
    {
        if(k > nums.length)
            k = k % nums.length;
        int[] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length );

    }

    public int KthSmallestNumber(int[] nums, int k) {
        Arrays.sort(nums);

        return nums[k];
    }





}

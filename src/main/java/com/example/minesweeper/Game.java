package com.example.minesweeper;

import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Game extends Stage {
    private final int width = 400;
    private final  int height = 400;

    private final int numRow = 10;
    private final int numCol = 10;

    private int[][] board = new int[10][10];

    public Game() {
        Random rand = new Random();
        ArrayList<Integer> mines = new ArrayList<Integer>();
        Integer newNum = null;
        for (int i = 0; i < 20; i++){
            while(newNum == null || mines.contains(newNum)){
                newNum = rand.nextInt(99);
            }
            System.out.println(newNum);
            mines.add(newNum);
            board[newNum/10][newNum%10] = -1;
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if(board[i][j] == -1){
                    if(i == 0){
                        if(j == 0){
                            board[i][j + 1] += 1;

                            board[i + 1][j] += 1;
                            board[i + 1][j + 1] += 1;
                        } else if(j == 9) {
                            board[i][j - 1] += 1;

                            board[i + 1][j] += 1;
                            board[i + 1][j - 1] += 1;
                        } else {
                            board[i][j - 1] += 1;
                            board[i][j + 1] += 1;

                            board[i + 1][j - 1] += 1;
                            board[i + 1][j] += 1;
                            board[i + 1][j + 1] += 1;
                        }


                    } else if( i == 9){
                        if(j == 0){
                            board[i][j + 1] += 1;

                            board[i - 1][j] += 1;
                            board[i - 1][j + 1] += 1;
                        } else if(j == 9) {
                            board[i][j - 1] += 1;

                            board[i - 1][j] += 1;
                            board[i - 1][j - 1] += 1;
                        } else {
                            board[i][j - 1] += 1;
                            board[i][j + 1] += 1;

                            board[i - 1][j - 1] += 1;
                            board[i - 1][j] += 1;
                            board[i - 1][j + 1] += 1;
                        }
                    } else {
                        if(j == 0){
                            board[i - 1][j] += 1;
                            board[i - 1][j + 1] += 1;

                            board[i][j] += 1;
                            board[i][j + 1] += 1;

                            board[i + 1][j] += 1;
                            board[i + 1][j + 1] += 1;
                        } else if(j == 9){
                            board[i - 1][j - 1] += 1;
                            board[i - 1][j] += 1;

                            board[i][j - 1] += 1;
                            board[i][j] += 1;

                            board[i + 1][j - 1] += 1;
                            board[i + 1][j] += 1;
                        } else {
                            board[i + 1][j - 1] += 1;
                            board[i + 1][j] += 1;
                            board[i + 1][j + 1] += 1;

                            board[i][j - 1] += 1;
                            board[i][j + 1] += 1;

                            board[i - 1][j - 1] += 1;
                            board[i - 1][j] += 1;
                            board[i - 1][j + 1] += 1;
                        }
                    }


                }
            }
        }
    }

    public void start(Stage stage){
        for(int i = 0; i < 10; i++){
            for( int j = 0; j < 10; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

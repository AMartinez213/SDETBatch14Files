package com.syntax.class11;

public class Replit85 {
    public static void main(String[] args) {
        int[][] arr = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        for (int row = 0; row < arr.length; row++) { //this equals to the row in our matrix.
            for (int col = 1; col < arr[row].length; col += 2) { //this equals to the column in each row.
                sum += arr[row][col];

            }

        }
            System.out.print(sum);


        }

    }



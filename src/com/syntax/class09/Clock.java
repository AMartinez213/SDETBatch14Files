package com.syntax.class09;

public class Clock {

    public static void main(String[] args) {

        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <=9 ; j++) {
                if(i==2&&j==4){
                    break;
                }

                for (int k = 0; k <=5 ; k++) {
                    for (int l = 0; l <=9 ; l++) {
                        if(i<=1||j<=3){
                        System.out.println(i+""+j+":"+k+""+l);

                        }

                    }


                    }

                }

            }

        }


    }





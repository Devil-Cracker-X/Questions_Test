package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Question_6 {

    private static TimeUnit thread;

    public static void countdown(int mint)  {
        TimeUnit t = TimeUnit.SECONDS;
        for (int z = mint;z>=0;z--){
            for(int i=58;i>0;i=i-2){
                try {
                    t.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(z-1+" minutes"+i+"seconds remaining");
            }
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        countdown(min);
    }
}



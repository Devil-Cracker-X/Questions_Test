package com.company;

import java.util.Scanner;

public class Question_5 {

    public static void arrange(String inpt) {

          int len = inpt.length();
          for (int i =0;i<len;i++) {
              String html = inpt.substring(0, (inpt.indexOf(">") + 1));
              inpt = inpt.substring((inpt.indexOf(">") + 1));
              System.out.println(html);
          }
//            arrange(inpt);

    }
    public static void main(String arg[]){
        String inp;
        Scanner sc = new Scanner(System.in);

        inp = sc.nextLine();
        arrange(inp);
    }
}

package com.company;

import java.util.Scanner;

// NOTE : - For me 'a' means it can be both upper and lower case

public class Question_4 {
    public static void convert(String inpt){

        // NOTE : - For me 'a' means it can be both upper and lower case
         String last = inpt.substring((inpt.length()-1));
         if(inpt.contains("o") || inpt.contains("u"))
                System.out.print(inpt.toUpperCase());

        else if (inpt.contains("O")) {
             System.out.print(inpt.toUpperCase());
         } else if (inpt.contains("U")) {
             System.out.print(inpt.toUpperCase());
         }

         else {
             if (inpt.contains("o") || inpt.contains("U"))
                 System.out.print(inpt.toUpperCase());

             else if (inpt.contains("O") || inpt.contains("u"))
                 System.out.print(inpt.toUpperCase());

             else if (inpt.contains("i") && inpt.contains("f"))
                 System.out.print(inpt.substring(0, 1).toUpperCase() + inpt.substring(1));

             else if (inpt.contains("I") && inpt.contains("f"))
                 System.out.print(inpt.substring(0, 1).toUpperCase() + inpt.substring(1));

             else if (inpt.contains("i") && inpt.contains("F"))
                 System.out.print(inpt.substring(0, 1).toUpperCase() + inpt.substring(1));

             else if (inpt.contains("I") && inpt.contains("F"))
                 System.out.print(inpt.substring(0, 1).toUpperCase() + inpt.substring(1));

             else if (inpt.substring(0, 1).contains("a") && last.equals("d")) {
                 inpt = "mango";
                 System.out.print(inpt);
             } else if (inpt.substring(0, 1).contains("A") && last.equals("d")) {
                 inpt = "mango";
                 System.out.print(inpt);
             } else if (inpt.substring(0, 1).contains("a") && last.equals("D")) {
                 inpt = "mango";
                 System.out.print(inpt);
             } else if (inpt.substring(0, 1).contains("A") && last.equals("D")) {
                 inpt = "mango";
                 System.out.print(inpt);
             }
         }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        convert(str);
    }
}

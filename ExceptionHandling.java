package com.example.firstfile;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scanner.nextLine();

        try {
            int st=Integer.parseInt(str);
            System.out.println(st);

        }catch (NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("Please input valid string to convert into integer.");
        }
    }
}

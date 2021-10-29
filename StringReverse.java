package com.example.firstfile;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=scanner.nextLine();
         firstmethod( str);
         secondway(str);
         thirdmethod(str);
    }

    private static void firstmethod( String str) {
        int strlen= str.length();
        String reverse=" ";
        for (int i=strlen-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println("The Reversed String is :"+ reverse);
    }

    private static void secondway(String str){
        StringBuilder reverse=new StringBuilder();
        reverse.append(str);
        System.out.println("The reversed string by second method is :"+reverse.reverse());
    }
    private static void thirdmethod(String str) {
        int strlen= str.length();
        String reverse=" ";
        System.out.print("The Reversed String by third way is :");
        for (int i=strlen-1;i>=0;i--)
        {

            System.out.print(str.charAt(i));
        }


    }

}

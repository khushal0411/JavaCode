package com.example.firstfile;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.sql.Struct;
import java.util.Scanner;

public class StudentBio {

  public static class StudentData {
      private String name;
      private String dob;
      private int number;
      private int age;
      private String bloodgroup;
      private String city;
      private String sub1;
      private String sub2;
      private int marks1, marks2, total, avg;
  }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of Students whose details is to be entered: ");
        int num=scanner.nextInt();
        StudentData[] st= new  StudentData[num];
        System.out.println("\nEnter the Details:");
        for (int i=0;i<num;i++)
        {
            System.out.println("Enter the  name:");
            String name=scanner.next();
            System.out.println("Enter the Date of birth of student:");
            String dob=scanner.next();
            System.out.println("Enter Contact number of student:");
            int number=scanner.nextInt();
            System.out.println("Enter the age:");
            int age=scanner.nextInt();
            System.out.println("Enter the Bloodgroup :");
            String bloodgroup=scanner.next();
            System.out.println("Enter the city :");
            String city=scanner.next();
            System.out.print("Enter the subject 1 name :");
            String sub1=scanner.next();
            System.out.print("Enter the subject 2 name:");
            String sub2=scanner.next();
            System.out.print("Enter the marks of sub 1:");
            int marks1=scanner.nextInt();
            System.out.print("Enter the marks of sub 2");
            int marks2=scanner.nextInt();
            st[i]= new StudentData();
            st[i].name=name;
            st[i].age=age;
            st[i].bloodgroup=bloodgroup;
            st[i].dob=dob;
            st[i].city=city;
            st[i].number=number;
            st[i].sub1=sub1;
            st[i].sub2=sub2;
            st[i].marks1=marks1;
            st[i].marks2=marks2;
            st[i].total=st[i].marks1+st[i].marks2;
            st[i].avg=st[i].total/2;
        }
        System.out.println("***********************************************************");
        System.out.println("The details entered are:");
        for (int i =0; i<num;i++)
        {

            System.out.println("Name : "+st[i].name);
            System.out.println("Age: "+String.valueOf(st[i].age));
            System.out.println("Bloodgroup : "+st[i].bloodgroup);
            System.out.println("DOB: "+st[i].dob);
            System.out.println("City: "+st[i].city);
            System.out.println("Contact Details:"+String.valueOf(st[i].number));
            System.out.println("Subject 1 name:"+st[i].sub1);
            System.out.println("Subject 2 name:"+st[i].sub2);
            System.out.println("Sub 1 marks:"+String.valueOf(st[i].marks1));
            System.out.println("Sub 2 marks :"+String.valueOf(st[i].marks2));
            System.out.println("The total Score is:"+st[i].total);

        }

    }
}

package com.ssms.admin;

import java.util.Scanner;

public class GetStudentDetails
{
      public static void main(String args[])
      {
          String name;
          int roll, math, phy, eng;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.println("Enter Name: \n");
          name=SC.nextLine();
          System.out.println("Enter Roll Number: \n");
          roll=SC.nextInt();
          System.out.println("Enter marks in Maths, Physics and English: \n");
          math=SC.nextInt();
          phy=SC.nextInt();
          eng=SC.nextInt();
           
          int total=math+eng+phy;
          float perc=(float)total/300*100;
           
          System.out.println("Roll Number:" + roll +"\tName: "+name);
          System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
          System.out.println("Total: "+total +"\tPercentage: "+perc);
            
      }
          
}
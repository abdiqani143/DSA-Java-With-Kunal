/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.First_Java_.Assignments;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Odd_Even {
     public static void main(String[] args) {
        // TODO code application logic here
         int number,remainder;
         System.out.println("Please Enter a Number");
         Scanner sc=new Scanner(System.in);
         number = sc.nextInt();
         sc.close();
         remainder=number%2;
         if(remainder==0)
             System.out.println(number+ " Is Even Number");
         else
              System.out.println(number+ " Is Odd Number");
    }
    
}

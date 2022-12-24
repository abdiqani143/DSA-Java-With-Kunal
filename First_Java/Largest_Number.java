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
public class Largest_Number {
    public static void main(String[] args)
    {
    int a,b;
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter Number 1");
        a=sc.nextInt();
        
        System.out.println("Enter Number 2");
        b=sc.nextInt();
        if(a>b)
            System.out.println("LargestNumber Is: " +a);
        else if(b>a)
            System.out.println("Largest Number Is: " + b);
        else
            System.out.println("Are Same");
    }
    
}

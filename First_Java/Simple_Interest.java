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
public class Simple_Interest {
    public static void main(String[] args){
    
        int p,r,t;
        double simple_interest;
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter The Principle");
        p = sc.nextInt();
        
         System.out.println("Enter The Rate");
        r = sc.nextInt();
        
         System.out.println("Enter The Time");
        t = sc.nextInt();
        
        simple_interest = (p*r*t)/100;
        System.out.println("Simple Interest Is: " + simple_interest);
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Conditional_And_Loops;

/**
 *
 * @author hp
 */
public class Reverse {
    public static void main(String[] args) {
        
        int num = 6576572;
        
        int ans =0;
        
        while(num > 0){
        
        int rem = num % 10;
        
        num /= 10;
        
        ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
    
}

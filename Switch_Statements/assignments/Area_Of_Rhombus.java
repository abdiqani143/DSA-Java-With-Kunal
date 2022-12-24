
package assignments;

import java.util.Scanner;

public class Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Diagonal 1");
        double a=sc.nextDouble();
        System.out.println("Enter The Diagonal 2");
        double b=sc.nextDouble();
        double area=(a*b)/2;
        System.out.println("Area  Of Rhombus: " + area);
    }
    
}

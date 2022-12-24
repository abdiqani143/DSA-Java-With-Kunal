
package assignments;

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter of the side of triangle");
        double a=sc.nextDouble();
        double  area=(Math.sqrt(3)/4)*(a*a);
        System.out.println("Area  Of Equilateral Triangle: " + area);
    }
    
}

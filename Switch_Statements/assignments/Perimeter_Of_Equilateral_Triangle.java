
package assignments;

import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter of radius");
        double p=sc.nextDouble();
       // double  area=3.14*p*p;
        double perimeter=3*p;
        System.out.println("Perimeter Of Equilateral Triangle: " + perimeter);
    }
}

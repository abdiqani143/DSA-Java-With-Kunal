
package assignments;

import java.util.Scanner;

public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter of radius");
        double p=sc.nextDouble();
       // double  area=3.14*p*p;
        double perimeter=2*3.14*p;
        System.out.println("Perimeter Of Circle: " + perimeter);
    }
}

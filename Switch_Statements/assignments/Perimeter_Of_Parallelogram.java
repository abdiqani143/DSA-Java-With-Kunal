
package assignments;

import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter of value 1 the sides of Parallelogram");
        double p=sc.nextDouble();
         System.out.println("Enter of value 2 the sides of Parallelogram");
        double a=sc.nextDouble();
         System.out.println("Enter of value Height the sides of Parallelogram");
        double h=sc.nextDouble();
        double perimeter=0;
         
         perimeter=2*(p+a);
       
        System.out.println("Perimeter Of Parallelogram: " + perimeter);
    }
}

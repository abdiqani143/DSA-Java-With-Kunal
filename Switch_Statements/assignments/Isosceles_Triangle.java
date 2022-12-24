
package assignments;

import java.util.Scanner;

public class Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length Side 1");
        double a=sc.nextDouble();
        System.out.println("Enter Side 2 of thee Triangle");
        double b=sc.nextDouble();
        double area=(b/a)*Math.sqrt((4*a*a)-(b-b));
        System.out.println("Area of Isosceles Triangle is: " + area);
    }
    
}

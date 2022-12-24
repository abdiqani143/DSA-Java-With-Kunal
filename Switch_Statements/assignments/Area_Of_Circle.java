
package assignments;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;


public class Area_Of_Circle {
    public static void main(String[] args) {
        double radius,area;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Radius Of Circle");
        radius = sc.nextDouble();
        sc.close();
        
        area = Math.PI * radius * radius;
        System.out.println("Area Of Circle Is: " + area);
    }
    
}

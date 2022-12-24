
package assignments;

import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int length=0;
       int breadth=0;
       int area=0;
//       int perimeter=0;
       
        System.out.println("Enter of Length of the Rectangle:");
         length=sc.nextInt();
         
          System.out.println("Enter of breadth of the Rectangle:");
         breadth=sc.nextInt();
         
         area = length*breadth;
//         perimeter = 2*(length*breadth);
         System.out.println("The Area Of Rectangle: " + area);
//          System.out.println("The Perimeter Of Rectangle: " + perimeter);
         
    }
    
}

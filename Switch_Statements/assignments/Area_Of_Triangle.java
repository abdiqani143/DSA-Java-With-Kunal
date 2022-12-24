
package assignments;

import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        Scanner sc2=new Scanner(System.in);
        
        System.out.println("Enter the lengtht of the triangle");
        int length=sc2.nextInt();
        
        System.out.println("Enter the Height of the triangle");
        int height=sc.nextInt();
        
        int result=(length*height)/2;
        System.out.println("The Area Of The Triangle Is: " + result);
       
        sc.close();;
        sc2.close();
    }
    
}


package assignments;

import java.util.Scanner;

public class Area_Of_Parallelogram {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int base,height,area;
        base=0;
        height=0;
        System.out.println("Enter Base");
        base=sc.nextInt();
        System.out.println("Enter Height");
       height=sc.nextInt();
        area=base*height;
        System.out.println("Area Of Parallelogram IS: " + area);
    }
    
}

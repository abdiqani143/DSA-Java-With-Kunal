
package switch_statements;

import java.util.Scanner;

public class Weekly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int week= sc.nextInt();
        
        switch(week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekly");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("End Week");
        }
    }
}

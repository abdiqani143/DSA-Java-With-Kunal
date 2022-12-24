
package switch_statements;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int days= scanner.nextInt();
        switch(days){
            case 1 :
              System.out.println("Saturday");
              break;
              case 2 :
              System.out.println("Sunday");
              break;
              case 3 :
              System.out.println("Monday");
              break;
              case 4 :
              System.out.println("Thuesday");
              break;
              case 5 :
              System.out.println("Sunday");
              break;
              case 6 :
              System.out.println("Thuesday");
              break;
              case 7 :
              System.out.println("Friday");
              break;
              default:
                  System.out.println("End Of Case");

        }
    }
}

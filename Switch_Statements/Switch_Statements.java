
package switch_statements;

import java.util.Scanner;


public class Switch_Statements {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "Mango":
                System.out.println("This is Manfo");
                break;
            case "Apple":
                System.out.println("This is Aplle");
                break;
            case "Lemon":
                System.out.println("This is Lemon");
                break;
            default:
                System.out.println("Nothing");
        }
    }
    
}

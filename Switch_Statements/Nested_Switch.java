
package switch_statements;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int EmpID=sc.nextInt();
        String department=sc.next();
        switch(EmpID){
            case 1:
                System.out.println("Abdiqani Mohamud");
                break;
            case 2:
                System.out.println("Hassan Farah");
                break;
            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                }
                break;
            default:
                System.out.println("End");
        }
                
    }
}

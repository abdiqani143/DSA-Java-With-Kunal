
package array_in_java;

import java.util.Scanner;

public class Multi_Dimensial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        
        for(int row=0; row<arr.length; row++){
        for(int col=0; col<arr[row].length; col++){
        arr[row][col]=sc.nextInt();
        }
        }
        // Output
         for(int row=0; row<arr.length; row++){
        for(int col=0; col<arr[row].length; col++){
            System.out.println(arr[row][col] + "");
        }
        }
        
    }
}

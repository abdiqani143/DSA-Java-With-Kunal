
package dsa.Conditional_And_Loops;


public class Count_Number {
    public static void main(String[] args) {
        int n = 6486;
        int count=0;
        while(n > 0)
        {
        
            int rem = n % 10;
            
            if(rem == 5){
            
            count++;
            }
            n = n / 10;
        
        }
        System.out.println(count);
    }
    
}

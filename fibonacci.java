//fibonacci series in java 
import java.util.*;


public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n , for which you wanna fibonacci sequence");
        int n = sc.nextInt();
        System.out.println("Fibonacci sequence upto "+ n + "is");
        for (int i=0; i<=n; i++) {
            int fibonacciNumber = getFibonacciNumber(i);
            System.out.print(fibonacciNumber+" ");
        }
    }
    public static int getFibonacciNumber(int n){
            if (n==0){
                return 0;
            }else if (n==1){
                return 1;
            }else{
                return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
            }
    }
    
    
}

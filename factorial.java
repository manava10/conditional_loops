import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n;");
        int n = sc.nextInt();
        System.out.println("The factrial upto n is ,");
        int factorial = getfactorial(n);
        System.out.print(factorial);

    }
     public static  int getfactorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*getfactorial(n-1);
        }
    }
}

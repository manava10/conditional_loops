import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        sum();
    }
     static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("The sum of a and b is" + a+b);


    }
    
}

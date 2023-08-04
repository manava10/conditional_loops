import java.util.Scanner;

public class leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you wanna check");
        int year = sc.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println("The given year is a leap year");
            }else{
                System.out.println("The given year is not a leap year ");
            }
        }else if(year%4==0){
            System.out.println("The given year is a leap year");

        }else{
            System.out.println("The given year is not a leap year");
        }
        
          

        
    }
}
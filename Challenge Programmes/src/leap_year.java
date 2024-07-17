import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int year;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the year:");
        year=k.nextInt();
        if(year%400==0){
            System.out.println("Year is a leap year.");
        }else if(year%100==0){
            System.out.println("Year is not a leap year.");
        }else if(year%4==0){
            System.out.println("Year is a leap year.");
        }else{
            System.out.println("Year is not a leap year.");
        }
    }
}

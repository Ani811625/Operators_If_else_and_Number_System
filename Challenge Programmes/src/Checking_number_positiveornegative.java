import java.util.Scanner;

public class Checking_number_positiveornegative {
    public static void main(String[] args) {
        int num;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number to check wether the number is positive or negative or zero:");
        num=k.nextInt();
        if(num<0){
            System.out.println("The number is negative.");
        }else if(num==0){
            System.out.println("The number entered is zero.");
        }else {
            System.out.println("The number is positive.");
        }
    }
}

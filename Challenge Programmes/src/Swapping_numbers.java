import java.util.Scanner;

public class Swapping_numbers {
    public static void main(String[] args) {
        int num1,num2;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=k.nextInt();
        System.out.println("Enter second number: ");
        num2=k.nextInt();
        int swap;
        swap=num1;
        num1=num2;
        num2=swap;
        System.out.println("Swapping Done...");
        System.out.println("First number i.e value of 'num1' is: "+num1);
        System.out.println("Second number i.e value of 'num2' is: "+num2);
    }
}
import java.util.Scanner;
public class twonumbers_allarithmetic_operations {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first number: ");
        num1=k.nextInt();
        System.out.println("Enter second number: ");
        num2=k.nextInt();
        System.out.println("Performing addition: "+(num1+num2));
        System.out.println("Performing subtraction: "+(num1-num2));
        System.out.println("Performing multiplication: "+(num1*num2));
        System.out.println("Performing division: "+(num1/num2));
        System.out.println("Performing modulus: "+(num1%num2));
    }
}

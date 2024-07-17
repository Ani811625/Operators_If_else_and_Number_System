import java.util.Scanner;

public class Bitwise_operators {
    public static void main(String[] args) {
        int num1,num2;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=k.nextInt();
        System.out.println("Enter the second number:");
        num2=k.nextInt();
        //Bitwise operators are used to perform operations on the bit format or binary representation of a number.
        /*Bitwise operators are generally binary operators except for negation which is a unary operator.
        Bitwise operators are:
        & ->And,
        | ->Or,
        ~ ->Not,
        ^ ->XOR,
        << ->Left shift,
        >> ->Right shift
         */
        System.out.println("AND: "+(num1 & num2));
        System.out.println("OR: "+(num1 | num2));
        System.out.println("NOT: "+(~num1));
        System.out.println("XOR: "+(num1 ^ num2));
        System.out.println("LEFT SHIFT: "+(num1<<1));
        System.out.println("RIGHT SHIFT: "+(num1>>1));
    }
}

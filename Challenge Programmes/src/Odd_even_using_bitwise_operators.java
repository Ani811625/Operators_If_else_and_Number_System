import java.util.Scanner;

public class Odd_even_using_bitwise_operators {
    public static void main(String[] args) {
        int num1;
        Scanner k=new Scanner((System.in));
        System.out.println("Enter the number:");
        num1=k.nextInt();
        if((num1&1)==1){
            System.out.println("The number is odd.");
        }else{
            System.out.println("The number is even.");
        }
        //Here the concept used is if we check the binary form of all numbers then we will see numbers that are even have 0 as their last bit or MSB and the odd numbers have 1 as their MSB.
        //So if we perform and operation of the number with 1 then considering the binary format if the number is even it has 0 as MSB and for 1 we know it has MSB as 1 so their and operation will result in 0(Since 0&1=0)
    }
}

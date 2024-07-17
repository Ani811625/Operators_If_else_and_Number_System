import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int num;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number to check it is even or odd:");
        num=k.nextInt();
        if(num%2==0){
            System.out.println("The number is EVEN");
        }
        else {
            System.out.println("The number is ODD");
        }
    }
}

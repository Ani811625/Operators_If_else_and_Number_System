import java.util.Scanner;

public class Rectangle_perimeter {
    public static void main(String[] args) {
        int side1,side2,side3,side4,perimeter;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter first side: ");
        side1=k.nextInt();
        System.out.println("Enter second side: ");
        side2=k.nextInt();
        System.out.println("Enter third side: ");
        side3=k.nextInt();
        System.out.println("Enter fourth side: ");
        side4=k.nextInt();

        perimeter=side1+side2+side3+side4;
        System.out.println("The perimeter of the rectangle with given sides is: "+perimeter);
    }
}

import java.util.Scanner;

public class triangle_area {
    public static void main(String[] args) {
        int base,height;
        double area;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base=k.nextInt();
        System.out.println("Enter height of the triangle: ");
        height=k.nextInt();
        area=(0.5*(base*height));
        System.out.println("The area of the triangle is: "+area);
    }
}

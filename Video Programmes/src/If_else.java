import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        //If else is used for condition checking.
        //Suppose i need to write a programme to check weather a boy is eligible for voting or not.Now to do this I have to check if the boy's age is above 18 then he is eligible else not.
        int age;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter your age:");
        age=k.nextInt();
        if (age<18){//"if" always works on boolean value.That is if the value inside the bracket is true then only code inside "if" block will execute else the code inside "else" block will execute.
            System.out.println("You are not a eligible voter.");
        }else {
            System.out.println("You are a eligible voter.");
        }

        System.out.println("Example of Nested If-else");

        //Nested if else can also be written.
        //Suppose I need to write a programme to check if the person of entered age is a child,adult or senior citizen
        //If age is less than 18 then child,age is more than or equal to 18 and less than 60 then adult and if age is greater then 60 then senior citizen
        if(age<18){
            System.out.println("You are a Child.");
        }else if (age>=18 && age<60){
            System.out.println("You are an Adult.");
        }else {
            System.out.println("You are a Senior Citizen");
        }
    }
}

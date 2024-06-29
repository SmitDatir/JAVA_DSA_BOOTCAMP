import java.util.Scanner;
public class calculate_the_value {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the operation you want to perform in text format: ");
        String c =sc.next();
        if( c.equals("addition")){
            System.out.println("Sum of two numbers is: "+(a+b));
        } else if(c.equals("substration")){
            System.out.println("Subtraction of two numbers is: "+(a-b));
        } else if(c.equals("multiplication")){
            System.out.println("Product of two numbers is: "+(a*b));
        } else if(c.equals("division")){
            System.out.println("Division of two numbers is: "+(a/b));
        }
    }
}

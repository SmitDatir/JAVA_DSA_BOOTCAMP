import java.util.Scanner;
public class sum_of_2_numbers{
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter the first number: ");
    a = sc.nextInt();
    System.out.println("Enter the second number: ");
    b =sc.nextInt();
    System.out.println("Sum of two numbers is: "+(a+b));
   }
}
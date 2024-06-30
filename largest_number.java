import java.util.Scanner;
public class largest_number {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the seconf number:");
        b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is the largest number of the two numbers");
        } else {
            System.out.println(b+" is the largest number of the two numbers");
        }
    }
}

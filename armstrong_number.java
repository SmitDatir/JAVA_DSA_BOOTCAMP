import java.util.Scanner;
public class armstrong_number {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n,rem, arm=0;
        System.out.println("Enter a number: ");
        n =sc.nextInt();
        int c =n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c == arm){
            System.out.println(c+" is a armstrong number");
        } else {
            System.out.println(c+" is not a armstrong number");
        }
    }
}

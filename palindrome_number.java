import java.util.Scanner;
public class palindrome_number {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int n,c,r,sum=0;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(c == sum){
            System.out.println("Number is a palindrome number");
        } else {
            System.out.println("Number is not a palindrome number");
        }
    }
}

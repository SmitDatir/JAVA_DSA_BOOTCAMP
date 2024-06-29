import java.util.Scanner;
public class simple_interest {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int p, r, t, interest;
    System.out.println("Pls enter the principal(p) amount: ");
    p=sc.nextInt();
    System.out.println(" Pls enter the rate of interest(r) per annum: ");
    r=sc.nextInt();
    System.out.println("pls enter the time(t) in months: ");
    t=sc.nextInt();
    interest = (p*r*t)/100;
    System.out.println("Simple interest is:  "+interest);
   } 
}

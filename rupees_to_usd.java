import java.util.Scanner;
public class rupees_to_usd {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the amount in rupees: ");
         float a= sc.nextFloat();
         System.out.println("Enter the price of usd as compare to rupees: ");
         float b = sc.nextFloat();
         float c= a/b;
         System.out.println("The amount in usd is: "+c );
    }
}

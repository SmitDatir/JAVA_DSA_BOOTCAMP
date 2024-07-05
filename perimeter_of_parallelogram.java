import java.util.Scanner;
public class perimeter_of_parallelogram {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the base of the parallelogram: ");
        a=sc.nextInt();
        System.out.println("Enter the base of the paralellogram: ");
        b=sc.nextInt();
        System.out.println("Perimeter of paralellogram is "+((a+b)*2));
    }
}

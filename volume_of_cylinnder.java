import java.util.Scanner;
public class volume_of_cylinnder {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double r,h,pi=3.1415;
        System.out.println("Enter the radius of the cylinder: ");
        r=sc.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        h = sc.nextInt();
        System.out.println("Volume of cylinder is "+(pi*r*r*h));
    }
}

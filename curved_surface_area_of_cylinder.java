import java.util.Scanner;
public class curved_surface_area_of_cylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r,h,pi=3.1415;
        System.out.println("Enter the radius of the cylinder: ");
        r=sc.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        h=sc.nextInt();
        System.out.println("Curved Surface Area Of Cylinder is "+(2*pi*r*h));
    }
}

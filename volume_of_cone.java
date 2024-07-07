import java.util.Scanner;
public class volume_of_cone {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double h,r,pi=3.1415,v;
        System.out.println("Enter the radius of the cube: ");
        r = sc.nextDouble();
        System.out.println("Enter the height of the cube: ");
        h =sc.nextDouble();
        v =pi*r*r*h;
        System.out.println("Volume of cube is "+(v/3));
    }
}

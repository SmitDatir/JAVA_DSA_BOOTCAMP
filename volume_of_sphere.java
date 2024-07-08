import java.util.Scanner;
public class volume_of_sphere {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double s,r,pi=3.1415;
        System.out.println("Enter the radius of the sphere: ");
        r=sc.nextDouble();
        s=4*pi*r*r*r;
        System.out.print("Volume of sphere is "+(s/3));
    }
}

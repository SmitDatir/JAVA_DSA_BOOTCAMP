import java.util.Scanner;
public class area_of_circle {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        double pi=3.141;
        int r;
        System.out.println("Enter the radius of a circle:");
        r =sc.nextInt();
        System.out.println("Area of circle is: "+(r*r*pi));
    }
}

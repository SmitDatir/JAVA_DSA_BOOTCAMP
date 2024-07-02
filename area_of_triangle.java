import java.util.Scanner;
public class area_of_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b,h;
        System.out.println("Enter the base of a triangle: ");
        b=sc.nextInt();
        System.out.println("Enter the height of a triangle: ");
        h=sc.nextInt();
        System.out.println("Area of a triangle is: "+(0.5*h*b));
    }
}

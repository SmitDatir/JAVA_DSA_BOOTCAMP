import java.util.Scanner;
public class area_of_isosceles_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h,b;
        System.out.println("enter the height of the triangle: ");
        h=sc.nextInt();
        System.out.println("enter the base of the triangle: ");
        b=sc.nextInt();
        System.out.println("area of isosceles triangle is: "+(h*b)/2);
    }
}

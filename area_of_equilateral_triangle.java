import java.util.Scanner;
public class area_of_equilateral_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the side of a triangle: ");
        a=sc.nextInt();
        System.out.println("Area of equilateral triangle is: "+(1.7*a*a)/4);
    }
}

import java.util.Scanner;
public class perimeter_of_equilateral_triangle {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the side of triangle: ");
        a =sc.nextInt();
        System.out.println("Perimeter of equilateral triangle is "+(3*a));
    }
}

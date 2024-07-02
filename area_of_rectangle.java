import java.util.Scanner;
public class area_of_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l,w;
        System.out.println("Enter the lenght of the rectangle: ");
        l=sc.nextInt();
        System.out.println("Enter the width of a rectangle: ");
        w=sc.nextInt();
        System.out.println("Area of rectangle is: "+(l*w));
    }
}

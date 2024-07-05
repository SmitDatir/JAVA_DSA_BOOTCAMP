import java.util.Scanner;
public class perimeter_of_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r;
        float pi =3.1415f;
        System.out.println("Enter the radius of circle: ");
        r = sc.nextInt();
        System.out.println("Perimeter of circle is: "+(2*pi*r));
    }
}

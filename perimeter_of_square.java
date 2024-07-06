import java.util.Scanner;
public class perimeter_of_square {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the side of square: ");
        a = sc.nextInt();
        System.out.println("Perimeter Of Square is "+(4*a));
    }
}

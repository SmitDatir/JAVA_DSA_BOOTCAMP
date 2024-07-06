import java.util.Scanner;
public class perimeter_of_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l,w;
        System.out.println("Enter the lenght of the rectangle: ");
        l=sc.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        w=sc.nextInt();
        System.out.println("Perimeter Of Rectangle is "+((l+w)*2));
    }
}

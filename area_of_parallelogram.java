import java.util.Scanner;
public class area_of_parallelogram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b,h;
        System.out.println("enter the base of a parallelogram: ");
        b=sc.nextInt();
        System.out.println("enter the height of a parallelogram: ");
        h=sc.nextInt();
        System.out.println("area pf a parallelogram is: "+(b*h));
    }
}

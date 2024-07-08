import java.util.Scanner;
public class volume_of_pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double l,w,h;
        System.out.println("Enter the lenght of the pyramid: ");
        l=sc.nextDouble();
        System.out.println("Enter the of width the pyramid: ");
        w=sc.nextDouble();
        System.out.println("Enter the of height the pyramid: ");
        h=sc.nextDouble();
        System.out.println("Volume of pyramid is "+((l*w*h)/3));
    }
}

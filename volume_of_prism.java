import java.util.Scanner;
public class volume_of_prism {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double   l,w,h;
        System.out.println("Enter the length of a rectangular prism: ");
        l=sc.nextDouble();
        System.out.println("Enter the width of a rectangular prism: ");
        w=sc.nextDouble();
        System.out.println("Enter the height of a rectangular prism: ");
        h=sc.nextDouble();  
        System.out.println("Volume of rectangular prism is "+(l*w*h));  
    }
}

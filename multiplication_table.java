import java.util.Scanner;
public class multiplication_table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want multiplication table of: ");
        int a =sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(a+" x "+i +" = " +a*i);
        }
    }
}

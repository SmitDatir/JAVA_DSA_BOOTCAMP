import java.util.Scanner;
public class greeting_message {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name: ");
        String a =sc.nextLine();
        System.out.println("Hello!!! "+a);
    }
}

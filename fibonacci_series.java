import java.util.Scanner;
public class fibonacci_series {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a=0,b=1,c,n;
     System.out.println("enter the value of n: ");
     n =sc.nextInt();
     for(int i=1;i<=n;i++){
        System.out.print(a+" ");
        c=a+b;
        a=b;
        b=c;
     }
    }
}

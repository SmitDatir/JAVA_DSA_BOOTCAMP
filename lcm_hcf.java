import java.util.Scanner;
public class lcm_hcf {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        int lcm;
        int hcf=0;
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        lcm=(a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("LCM of two numbers is "+lcm);
                break;
            }
            lcm++;
        }
        for(int i=1;i<a;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
            
        }
        System.out.println("HCF of two numbers is "+hcf);
    }
}

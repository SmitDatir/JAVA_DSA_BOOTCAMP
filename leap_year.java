import java.util.Scanner;
public class leap_year{
    public static void main(String args[]){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        year=sc.nextInt();
        if(year/4 == 0){
            System.out.println(year+" is a leap year");
        } else {
            System.out.println(year+" is not a leap year");
        }
         
    }
}
import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Give numbers (enter 'x' to stop ): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
                }
            }
        }

        System.out.println("The sum of all entered numbers is: " + sum);
    }
}


import java.util.Scanner;

public class USERTRAILMAIN {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter value 1: ");
            int val1 = sc.nextInt();

            System.out.print("Enter value 2: ");
            int val2 = sc.nextInt();

            USERTRAIL userTrail = new USERTRAIL(val1, val2);

            if (userTrail.show()) {
                System.out.println("Both values are greater than zero.");
            } else {
                System.out.println("Both values are not greater than zero.");
            }
        } catch (IllegalAccessException e) {
            System.out.println("Error: " + e);
        } 
    }
}
import java.util.Scanner;

public class Employeemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter employee details:");
            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Employee Name: ");
            String empName = sc.next();

            System.out.print("Designation (Manager/Officer/Clerk): ");
            String designation = sc.next();

            System.out.print("Basic Salary: ");
            double basic = sc.nextDouble();

            Employee emp = new Employee(empId, empName, designation, basic);
            emp.printDET();
        } catch (LowSalException e) {
            System.out.println("Error: " + e);
        } 
    }
}

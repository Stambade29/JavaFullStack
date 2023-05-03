public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private double hra;

    public Employee(int empId, String empName, String designation, double basic) throws LowSalException {
        if (basic < 500) {
            throw new LowSalException();
        }
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        this.hra = calculateHRA();
    }

    private double calculateHRA() {
        switch (designation.toLowerCase()) {
            case "manager":
                return 0.1 * basic;
            case "officer":
                return 0.12 * basic;
            case "clerk":
                return 0.05 * basic;
            default:
                return 0.0;
        }
    }

    public void printDET() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
    }

    public double getHRA() {
        return hra;
    }
}

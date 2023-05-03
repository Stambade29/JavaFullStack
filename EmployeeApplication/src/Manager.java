
public class Manager extends Employee{
	public double Bonus;

	public Manager(int empId, String empName, double empsal, double bonus) {
		super(empId, empName, empsal);
		Bonus = bonus;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}
}

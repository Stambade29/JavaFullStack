
public class Developre extends Employee{
	private int bonus;

	public Developre(int empId, String empName, double empSal, int bonus) {
		super(empId, empName, empSal);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}

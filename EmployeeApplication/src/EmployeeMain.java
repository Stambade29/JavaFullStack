
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mobj=new Manager(101, "Shubhangi", 20000,20);
		System.out.println("Manager Details");
		display(mobj);
		Developer dobj=new Developer(1, "Shubhangi",200000, 2)
		System.out.println("Developer Details");
		display(dobj);
		
	}
	public static void display(Employee emp)
	{
		
		System.out.println("Manager Id :"+emp.getEmpId());
		System.out.println("Manager Name :"+emp.getEmpName());
		System.out.println("Manager Salry:"+emp.getEmpsal());
		
		if(emp instanceof Manager)
		{
			Manager mobj=(Manager)emp;
			System.out.println("Manager extra hr:"+mobj.getNohr());
			
		}
		
		
		System.out.println("============================================");
		
		if(emp instanceof Developre)
		{
			Developre dobj=(Developre)emp;
			System.out.println("Developer Bonus:"+dobj.getBonus());
		}
	}

}

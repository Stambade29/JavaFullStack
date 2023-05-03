
public class empployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 sc=new employee1(100,"Shubhangi",3000);
		double emppf=30000*0.07f;
		sc.setEmppf(emppf);
		double emphra=30000*0.06;
		sc.setEmphra(emphra);
		double empta=30000*0.05;
		sc.setEmpta(empta);
	 display(sc);
	 
		

	}

	public static void display(employee1 sc) {

		System.out.println("\t\tEmployee id\t\t:"+sc.getEmpid());
		System.out.println("\t\tEmployee name\t\t:"+sc.getEmpname());
		System.out.println("\t\tEmployee Salary\t\t:"+sc.getEmpsalary());
		System.out.println("\t\tEmployee pf\t\t:"+sc.getEmppf());
		System.out.println("\t\tEmployee ra\t\t:"+sc.getEmphra());
		System.out.println("\t\tEmployee ta\t\t:"+sc.getEmpta());
		
	
	}

}



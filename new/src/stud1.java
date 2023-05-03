
public class stud1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 sc=new student1(23,"Shubhangi",23,34,45);
		int total=sc.getSub1()+sc.getSub2()+sc.getSub3();
		sc.setTotal(total);
		float percentage=sc.getTotal();
	    sc.setPercentage(percentage);
	    display(sc);
	    
	    
	}
	public static void display(student1 sc) {
	
	System.out.println("\t\tRoll no\t\t:"+sc.getRollno());
	System.out.println("\t\tName:"+sc.getName());
	System.out.println("\t\tMaths:"+sc.getSub1());
	System.out.println("\t\tEnglish:"+sc.getSub2());
	System.out.println("\t\tMarathi:"+sc.getSub3());
	System.out.println("\t\tTotal:"+sc.getTotal());
	System.out.println("\t\tPercentage:"+sc.getPercentage());
	
	
		
	}
}


public class Testcompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment c[]=new Compartment[10];
		double i=Math.random()*5;
		int a=(int)i;
		System.out.println(a);
		switch(a) {
		case 1:
			c[0]=new Firstclass();
			c[0].notice();
			break;
			
		case 2:
			c[1]=new Ladies();
			c[1].notice();
			break;
		
		case 3:
			c[2]=new General();
			c[2].notice();
			break;
		
		case 4:
			c[3]=new Luggage();
			c[3].notice();
	}
	  }
}

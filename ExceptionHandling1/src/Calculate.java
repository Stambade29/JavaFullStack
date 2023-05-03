
public class Calculate {
	int n1;
	int n2;
	public Calculate(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public double avgFirstN(int n) {
		double avg=0;
		try {
			if(n<0) {
				throw new IllegalArgumentException();	
			}
			avg=n/2;
		}
		catch(Exception e) {
			System.out.println("Some exception");
			throw e;
		}
		return avg;
	}
	

}

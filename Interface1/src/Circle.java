
public class Circle implements Shape {
	private float r;
	
	

	public Circle(float r) {
		super();
		this.r = r;
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		float ca=3.14f*r*r;
		System.out.println("Area of circle is:"+ca);
		
	}

	@Override
	public void ThankYou() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using eclipse");
		
		
	}
	

}

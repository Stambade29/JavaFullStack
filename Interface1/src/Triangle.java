
public class Triangle implements Shape{
	 final float b,h;
	

	public Triangle(float b, float h) {
		super();
		this.b = b;
		this.h = h;
		
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		 float ta=(float) ((0.5)*b*h);
		System.out.println("Area of triangle is:"+ta);
		
	}

	@Override
	public void ThankYou() {
		// TODO Auto-generated method stub
		System.out.println("Thank you ");
		
	}
	

}


public class Reactangle extends Shape{
	private float l,b,ra;

	public Reactangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}
	public void FindArea() {
		float ra=l*b;
		System.out.println("Area of Rectangle is:"+ra);
	}
	

}

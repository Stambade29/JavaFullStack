
public class Triangle extends Shape {

	private float b,h,ta;

	public Triangle(float b, float h) {
		super();
		this.b = b;
		this.h = h;
		
	}
	public void FindArea() { 
		float ta=0.5f*b*h;
		System.out.println("Area of Triangle is:"+ta);
	}
	
}

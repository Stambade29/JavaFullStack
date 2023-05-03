
public class Rectanglemain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle R=new Rectangle(12.4f,23.6f);
		System.out.println("Area of rectangle is:");
		displayArea(R);
		displayPerimeter(R);
	}
public static void displayArea(Rectangle R) {
	System.out.println("Length is:"+R.getLength());
	System.out.println("Breadth is:"+R.getBreadth());
	System.out.println("Area of rectangle is:"+R.getLength()*R.getBreadth());
}
public static void displayPerimeter(Rectangle R) {
	System.out.println("Area of rectangle is:"+2*(R.getLength())*(R.getBreadth()));
}
}

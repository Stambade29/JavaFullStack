
public class Son extends Father {
int sage;
public Son(int sage) {
	super(sage+30);
	this.sage=sage;
	
}
public void showAge() {
	super.showAge();
	System.out.println("The age of son is:"+sage);
}
}

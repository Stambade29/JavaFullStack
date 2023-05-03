
public class Father extends Grandfather {
private int Fage;
public Father (int Fage) {

super(Fage+30);
this.Fage=Fage;

}
public void showAge() {
	super.showAge();
	System.out.println("The age of Father is:"+Fage);
}
}

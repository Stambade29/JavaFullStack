
public class Fruit {
private String Fname;
private int Fqty;
private String Ftype;
public Fruit(String fname, int fqty, String ftype) {
	super();
	Fname = fname;
	Fqty = fqty;
	Ftype = ftype;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public int getFqty() {
	return Fqty;
}
public void setFqty(int fqty) {
	Fqty = fqty;
}
public String getFtype() {
	return Ftype;
}
public void setFtype(String ftype) {
	Ftype = ftype;
}


}


public class Customer {
public int Cid;
public String Cname;
public int Cmobile;
public String Caddr;
public Customer(int cid, String cname, int cmobile, String caddr) {
	super();
	Cid = cid;
	Cname = cname;
	Cmobile = cmobile;
	Caddr = caddr;
}
public int getCid() {
	return Cid;
}
public void setCid(int cid) {
	Cid = cid;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public int getCmobile() {
	return Cmobile;
}
public void setCmobile(int cmobile) {
	Cmobile = cmobile;
}
public String getCaddr() {
	return Caddr;
}
public void setCaddr(String caddr) {
	Caddr = caddr;
}


}

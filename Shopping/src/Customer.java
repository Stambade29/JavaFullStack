
public class Customer {
	private int Custid;
	private String Custname;
	private int Custmobile;
	private Address addr;
	private Product prod[];
	public Customer(int custid, String custname, int custmobile, Address addr, Product[] prod) {
		super();
		Custid = custid;
		Custname = custname;
		Custmobile = custmobile;
		this.addr = addr;
		this.prod = prod;
	}
	public int getCustid() {
		return Custid;
	}
	public void setCustid(int custid) {
		Custid = custid;
	}
	public String getCustname() {
		return Custname;
	}
	public void setCustname(String custname) {
		Custname = custname;
	}
	public int getCustmobile() {
		return Custmobile;
	}
	public void setCustmobile(int custmobile) {
		Custmobile = custmobile;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Product[] getProd() {
		return prod;
	}
	public void setProd(Product[] prod) {
		this.prod = prod;
	}
	
	
}

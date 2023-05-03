
public class Customer {
	private int Cust_Id;
	private String Cust_name;
	private String Cust_mob;
	public Customer(int cust_Id, String cust_name, String cust_mob) {
		super();
		Cust_Id = cust_Id;
		Cust_name = cust_name;
		Cust_mob = cust_mob;
	}
	public int getCust_Id() {
		return Cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		Cust_Id = cust_Id;
	}
	public String getCust_name() {
		return Cust_name;
	}
	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}
	public String getCust_mob() {
		return Cust_mob;
	}
	public void setCust_mob(String cust_mob) {
		Cust_mob = cust_mob;
	}
	
	

}

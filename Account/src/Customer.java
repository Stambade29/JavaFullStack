
public class Customer {
	private int Cust_id;
	private String Cust_name;
	private int Cust_mob;
	private Account1 accobj;
	public Customer(int cust_id, String cust_name, int cust_mob, Account1 accobj) {
		super();
		Cust_id = cust_id;
		Cust_name = cust_name;
		Cust_mob = cust_mob;
		this.accobj = accobj;
	}
	public int getCust_id() {
		return Cust_id;
	}
	public void setCust_id(int cust_id) {
		Cust_id = cust_id;
	}
	public String getCust_name() {
		return Cust_name;
	}
	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}
	public int getCust_mob() {
		return Cust_mob;
	}
	public void setCust_mob(int cust_mob) {
		Cust_mob = cust_mob;
	}
	public Account1 getAccobj() {
		return accobj;
	}
	public void setAccobj(Account1 accobj) {
		this.accobj = accobj;
	}
}

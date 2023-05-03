
public class ShoppinMain {

	public static void main(String[] args) {
		
		Shopinfo sinfo=new Shopinfo();
		Customer cust=sinfo.create();
		Bill bobj=sinfo.getBill(cust);	
		
		sinfo.display(cust, bobj);
		}
}

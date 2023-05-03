import java.util.Date;
public class Shopinfo {
	public  Customer create() {
		
		Product proarr[]=new Product[3];
		Product pro1=new Product(1,"Laptop",50000,2);
		Product pro2=new Product(2,"Watch",5411,5);
		Product pro3=new Product(3,"Phone",20000,2);
		proarr[0]=pro1;
		proarr[1]=pro2;
		proarr[2]=pro3;
		
		Address add=new Address("Pune","Maharashtra",411014);
		
		Customer cust=new Customer(10,"Shubhangi",97649796, add, proarr);
		
		return cust;
		}

	public void display(Customer cust,Bill bobj) {
		System.out.println("------------Customer Details-------------");
		System.out.println("---------------------------------------");
		System.out.println("Customer id:"+cust.getCustid());
		System.out.println("Customer Name:"+cust.hashCode());
		System.out.println("Customer Mobile Number is:"+cust.getCustmobile());
		
		Product prod[]=((Customer) cust).getProd();
		System.out.println("-----------Product Details----------");
		for( int i=0;i<prod.length;i++) {
		System.out.println("Product id is:"+prod[i].getProid());
		System.out.println("Product name is:"+prod[i].getProname());
		System.out.println("Product Prize is:"+prod[i].getProprize());
		System.out.println("Product Quantity is:"+prod[i].getProqty());
			
	}

	}
	public Bill getBill(Customer cust) {
		Product proarr[]=cust.getProd();
		double Total=0;
		double cgst;
		double sgst;
		double FinalTotal;
		for(int i=0;i<proarr.length;i++) {
			Total=Total+proarr[i].getProprize()*proarr[i].getProqty();
		}
		System.out.println("The Final Amount of Bill is:"+Total);;
		cgst=Total*0.06;
		sgst=Total=0.05;
		FinalTotal=Total+cgst+sgst;
		Bill bobj=new Bill(1,new Date(), Total, cgst, sgst, FinalTotal);
		return bobj;
	}
}

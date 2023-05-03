package linkcode.dao;
import linkcode.dao.ProductDao;
import linkcode.dao.ProductDaoImpl;
import linkcode.entity.Product;
import java.util.Scanner;
public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch=0;
		ProductDao pdao=new ProductDaoImpl();
		do 
		{
		System.out.println("1-Create\n2-Search\n3-Delete\n4-Update\n5-Display all");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        	System.out.println("Enter product id,name,price,quantity");
        	Product pobj=new Product(sc.nextInt(),sc.next(),sc.nextFloat(),sc.nextInt()); 
        	pdao.create(pobj);
        	break;
        	
        case 2:
        	System.out.println("Enter product id to search");
        	int Prod_id=sc.nextInt();
        	pdao.search(Prod_id);
        
        case 3:
        	System.out.println("Enter product id to delete");
        	Prod_id=sc.nextInt();
        	pdao.delete(Prod_id);
        	break;
        	
        case 4:
        	System.out.println("Enter product price and product quantity to update");
        	float Prod_price=sc.nextFloat();
        	int Prod_qty=sc.nextInt();
        	System.out.println("Enter product id you  to update");
        	int Prod_id1=sc.nextInt();
        	pdao.update(Prod_price, Prod_qty,Prod_id1);
        	break;
        }
        System.out.println("Do you want to continue press yes or no");
        }while(sc.next().equals("yes"));
		System.out.println("------------------------Thank you----------");
	}
}
		
	



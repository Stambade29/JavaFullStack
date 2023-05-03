import java.util.Scanner;
public class product2 {

	public static void main(String[] args) {
		
		product1 sc=new product1(23,"Alchemist",230);
		display(sc);
		// TODO Auto-generated method stub

	}
	public static void display(product1 sc)
	{
		System.out.println("\t\tproduct id is\t\t :"+sc.getProid());
		System.out.println("\t\tName of product is\t\t :"+sc.getProName());
        System.out.println("\t\tPrize of product is\t\t :"+sc.getProprize());
		
	}

}

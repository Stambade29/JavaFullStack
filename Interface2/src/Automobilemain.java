import java.util.Scanner;

public class Automobilemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int ch=0;
     Scanner sc=new Scanner(System.in);
     Automobile a=null;
     String str=null;
     Bike b=null;
     do {
    	 System.out.println("1-Maruti\n2-Audi\n3-Mercedes\n4-Bike");
    	 System.out.println("Enter your choice");
    	 ch=sc.nextInt();
    	 switch(ch){
    	 case 1:
    		 a=new Maruti();
    		 System.out.println("Maruti Model :"+a.getModel());
    		 System.out.println("Maruti Colour :"+a.getColour());
    		 System.out.println("Maruti Price :"+a.getPrice());
    		 break;
    	 case 2:
    		 a=new Audi();
    		 System.out.println("Audi Model :"+a.getModel());
    		 System.out.println("Audi Colour :"+a.getColour());
    		 System.out.println("Audi Price :"+a.getPrice());
    		 break;
    	 case 3:
    		 a=new Mercedes();
    		 System.out.println("Mercedes Model :"+a.getModel());
    		 System.out.println("Mercedes Colour :"+a.getColour());
    		 System.out.println("Mercedes Price :"+a.getPrice());
    		 break;
    	 case 4:
    		 b=new Activa();
    		 System.out.println("Bike model is:"+b.getModel());
    		 System.out.println("Bike color is:"+b.getColour());
    		 System.out.println("Bike prize is:"+b.getPrice());
    		 System.out.println("CC of bike is:"+b.getacc());
   		 
    	 }
    	 System.out.println("Do you want to continue press 1");
    	 str=sc.next();
     }while(ch==1);
	}

}
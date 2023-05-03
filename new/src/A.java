// Variables in java 
//1.instnace 2.static 3.local 
public class A {
    static int b=20;   //static variable
    int c=30;          //instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10;  //local variable
	 
	A ref=new A();    //object class is created for instance variable
	System.out.println(ref.c);     
	System.out.println(A.b);
	System.out.println(a);
	
	}
}


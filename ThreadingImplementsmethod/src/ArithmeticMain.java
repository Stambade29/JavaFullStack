
public class ArithmeticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmeticoperation ao=new Arithmeticoperation(10,20);
		ArithmeticThread athread=new ArithmeticThread(ao);
		Thread t=new Thread(athread);
		t.start();
		

	}

}

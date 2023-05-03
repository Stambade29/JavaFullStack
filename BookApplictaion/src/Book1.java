import java.util.Scanner;

public class Book1 {

	private String Book_title;
	 private int Book_Prize;
	public Book1(String bpook_title, int book_Prize) {
		super();
		Book_title = bpook_title;
		Book_Prize = book_Prize;
	}
	public String getBook_title() {
		return Book_title;
	} 	
	public void setBpook_title(String book_title) {
		Book_title = book_title;
	}
	public int getBook_Prize() {
		return Book_Prize;
	}
	public void setBook_Prize(int book_Prize) {
		Book_Prize = book_Prize;
	}
	 
	public void CreateB()
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the title of book");
		 String Book_title=sc.next();
		 System.out.println("Enter the prize of book");
		 int Book_Prize=sc.nextInt();
	}
	public void ShowB() {
		System.out.println("Title of book is:"+Book_title);
		System.out.println("Prize of book is:"+Book_Prize);
	}
}


public class Book {
	private String Book_title;
	private String Book_prize;
	private Book arr[];
	public Book(String book_title, String book_prize) {
		super();
		Book_title = book_title;
		Book_prize = book_prize;
	}
	public String getBook_title() {
		return Book_title;
	}
	public void setBook_title(String book_title) {
		Book_title = book_title;
	}
	public String getBook_prize() {
		return Book_prize;
	}
	public void setBook_prize(String book_prize) {
		Book_prize = book_prize;
	}
	

}

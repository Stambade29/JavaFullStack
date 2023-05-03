
public class Book {
	private int Book_id;
	private String Book_name;
	private String Book_author;
	private int Book_prize;
	public Book(int book_id, String book_name, String book_author, int book_prize) {
		super();
		Book_id = book_id;
		Book_name = book_name;
		Book_author = book_author;
		Book_prize = book_prize;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public String getBook_author() {
		return Book_author;
	}
	public void setBook_author(String book_author) {
		Book_author = book_author;
	}
	public int getBook_prize() {
		return Book_prize;
	}
	public void setBook_prize(int book_prize) {
		Book_prize = book_prize;
	}
	

	
}

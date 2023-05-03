
public class Librarian extends Book {
	public int Librarian_id;
	public String Librarian_name;
	public int Nohr;
	public Librarian(int book_id, String book_name, String book_author, int book_prize, int librarian_id,
			String librarian_name, int nohr) {
		super(book_id, book_name, book_author, book_prize);
		Librarian_id = librarian_id;
		Librarian_name = librarian_name;
		Nohr = nohr;
	}
	public int getLibrarian_id() {
		return Librarian_id;
	}
	public void setLibrarian_id(int librarian_id) {
		Librarian_id = librarian_id;
	}
	public String getLibrarian_name() {
		return Librarian_name;
	}
	public void setLibrarian_name(String librarian_name) {
		Librarian_name = librarian_name;
	}
	public int getNohr() {
		return Nohr;
	}
	public void setNohr(int nohr) {
		Nohr = nohr;
	}
	

}


public class Product {
	private int Proid;
	private String Proname;
	private int Proprize;
	private int Proqty;
	public Product(int proid, String proname, int proprize, int proqty) {
		super();
		Proid = proid;
		Proname = proname;
		Proprize = proprize;
		Proqty = proqty;
	}
	public int getProid() {
		return Proid;
	}
	public void setProid(int proid) {
		Proid = proid;
	}
	public String getProname() {
		return Proname;
	}
	public void setProname(String proname) {
		Proname = proname;
	}
	public int getProprize() {
		return Proprize;
	}
	public void setProprize(int proprize) {
		Proprize = proprize;
	}
	public int getProqty() {
		return Proqty;
	}
	public void setProqty(int proqty) {
		Proqty = proqty;
	}
	

}

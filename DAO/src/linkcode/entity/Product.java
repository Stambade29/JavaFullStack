package linkcode.entity;
public class Product {
	private int Prod_id;
	private String Prod_name;
	private float Prod_price;
	private int Prod_qty;
	public Product(int prod_id, String prod_name, float prod_price, int prod_qty) {
		super();
		Prod_id = prod_id;
		Prod_name = prod_name;
		Prod_price = prod_price;
		Prod_qty = prod_qty;
	}
	public int getProd_id() {
		return Prod_id;
	}
	public void setProd_id(int prod_id) {
		Prod_id = prod_id;
	}
	public String getProd_name() {
		return Prod_name;
	}
	public void setProd_name(String prod_name) {
		Prod_name = prod_name;
	}
	public float getProd_price() {
		return Prod_price;
	}
	public void setProd_price(float prod_price) {
		Prod_price = prod_price;
	}
	public int getProd_qty() {
		return Prod_qty;
	}
	public void setProd_qty(int prod_qty) {
		Prod_qty = prod_qty;
	}
	

}

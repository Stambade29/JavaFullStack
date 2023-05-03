package linkcode.dao;
import linkcode.entity.Product;
public interface ProductDao {

		public void create(Product p);
		public void search(int prod_id);
		public void delete(int prod_id);
		public void update(float Prod_price,int Prod_qty,int prod_id);
		
	}

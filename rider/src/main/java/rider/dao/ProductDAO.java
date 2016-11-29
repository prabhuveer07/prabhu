package rider.dao;

import java.util.List;

import rider.model.Product;

public interface ProductDAO {
	 
	    public void Update(Product rm);
	    public void insert(Product rm);
	    public void delete(int id); 
	    public List<Product> list1();
	    public Product prodbyid(int id);
		
		
	    
}

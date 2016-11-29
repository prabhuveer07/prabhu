package rider.dao;
 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rider.model.Product;
import rider.model.RiderModel;
 
@Repository("ProductDao")
public class ProductDAOimpl implements ProductDAO {
    @Autowired
    private SessionFactory sessionFactory;
 
  
	
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Transactional
    public void insert(Product rm)
    {
    	
    	Session session=sessionFactory.openSession();
    
		session.save(rm);
		session.flush();
    	}


	    
	@Transactional
	public void Update(Product rm) {
		Session session=sessionFactory.openSession();
		session.update(rm);
		session.flush();
	}

/*@Transactional
    public void delete(Product rm){
		Session session=sessionFactory.getCurrentSession();
		session.delete(rm);
		session.flush();
	}
*/
	@Transactional

public List<Product> list1() {
	
	
	Session session=sessionFactory.openSession();
	@SuppressWarnings("unchecked")
	List<Product> lists1=session.createQuery("from Product").list();
	return lists1;
}


public Product prodbyid(int id) {
	Session session=sessionFactory.openSession();
	Product product=(Product)session.get(Product.class,id);
	session.close();
	return product;
}

@SuppressWarnings("unused")
public void delete(int id)
{
Session session = sessionFactory.openSession();
Product product1=(Product)session.get(Product.class,id);
session.delete(product1);
session.flush();
session.close();
}


}


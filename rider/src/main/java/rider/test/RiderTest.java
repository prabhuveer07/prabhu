package rider.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext  ;

import rider.dao.ProductDAO;
import rider.dao.UserDAOImpl;
import rider.model.Product;
import rider.model.RiderModel;

public class RiderTest {

	
	@Autowired
	
	
	public static void main (String args[])
	{
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		
		appobj.scan("rider.config");
        appobj.refresh();
        ProductDAO pd=(ProductDAO)appobj.getBean("Prod");
    //    RiderModel add =new RiderModel();
       Product add1 = new Product();
        
        
        /* add1.setId(34);
         add1.setCategory("Fullface");
         add1.setDescription("corsa");
         add1.setPrice(150000);
         add1.setName("project46");
         add1.setManufacturer("agv");
         add1.setAvailable(7);
         */
         
	/*
	add.setUsername("jacky");
	add.setEmail("prabhuveer07.pv@gmail.com");
	add.setPassword("assassin7");
	
	*/
	System.out.println("after next");
	//ud.delete(add);
//	System.out.println(add);
	pd.insert(add1);
	//pd.update(add1);
	pd.delete(7);
	//System.out.println(add1);
	}
}

	
	
	
	
	
	
	
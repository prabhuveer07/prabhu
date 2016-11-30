package rider.dao;
 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rider.model.RiderModel;
 
@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;
 
    public UserDAOImpl(SessionFactory sessionFactory) {
         this.sessionFactory=sessionFactory;
    }

	
    @Transactional
    public void insert(RiderModel rm)
    {
    	System.out.println(rm.getEmail());
    	Session session=sessionFactory.getCurrentSession();
    	rm.setRoleId("USER_ROLE");
    	rm.setEnabled(true);
		session.save(rm);
		session.flush();
    	}
    
	@Transactional
	public void Update(RiderModel rm) {
		Session session=sessionFactory.getCurrentSession();
		session.update(rm);
		session.flush();
	}

	@Transactional
    public void delete(RiderModel rm){
		Session session=sessionFactory.getCurrentSession();
		session.delete(rm);
		session.flush();
	}


	public List<RiderModel> list1(String username,String password) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<RiderModel> lists1=session.createQuery("from RiderModel user WHERE user.username='"+username+"' and user.password='"+password+"'").list();
		return lists1;
	}


	public void setRoleId(RiderModel obj) {
		// TODO Auto-generated method stub
		
	}


	
		

}





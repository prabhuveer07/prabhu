package rider.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import rider.dao.ProductDAO;
import rider.dao.ProductDAOimpl;
import rider.dao.UserDAO;
import rider.dao.UserDAOImpl;
import rider.model.Product;
import rider.model.RiderModel;
@Configuration
@ComponentScan("rider.model")
@EnableTransactionManagement

public class Riderconfig {

	
	
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	 
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    sessionBuilder.addProperties(getHibernateProperties());
	    System.out.println("before");
	    sessionBuilder.addAnnotatedClasses(RiderModel.class);
	    sessionBuilder.addAnnotatedClasses(Product.class);
	 System.out.println("after");
	    return sessionBuilder.buildSessionFactory();

	}
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	    dataSource.setUsername("sa");
	    dataSource.setPassword("sa");
	 
	    return dataSource;
	}
	private Properties getHibernateProperties() {
		System.out.println("appjava");
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    properties.put("hibernate.hbm2ddl.auto","update");
	    return properties;
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
	        SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	            sessionFactory);
	 
	    return transactionManager;
	}
	@Autowired
	@Bean(name = "userDao")
	public UserDAO getUserDao(SessionFactory sessionFactory) {
	    return new UserDAOImpl(sessionFactory);
	}
	@Autowired
	@Bean(name = "Prod")
	public ProductDAO getProductDAO(SessionFactory sessionFactory) {
	    return new ProductDAOimpl();
	}


}



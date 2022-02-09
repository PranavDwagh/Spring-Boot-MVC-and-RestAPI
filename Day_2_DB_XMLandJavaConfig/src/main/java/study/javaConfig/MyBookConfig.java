package study.javaConfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import study.DAO.BookDAO;

@Component
//@ImportResource("classpath:beans.xml")
public class MyBookConfig {

	@Autowired
	public DataSource ds;
	
	
	@Bean
	public static DataSource dataSource()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		 dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dmds.setUrl("jdbc:mysql://localhost:3306/bookshop");
		 dmds.setUsername("root");
		 dmds.setPassword("9923140389");
		 
		 return dmds;
	}
	
	@Bean
	public BookDAO getBookDao()
	{
		BookDAO obj = new BookDAO();
		obj.setDs(ds);
		return obj;
	}
	
}

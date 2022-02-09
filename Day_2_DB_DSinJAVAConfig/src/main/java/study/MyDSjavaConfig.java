package study;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration             // configuration annotation required only on class which is going to a your configuration class
public class MyDSjavaConfig {
	
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
	

}

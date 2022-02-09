package abc;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import abc.ex1.BookDAO;

@SpringBootApplication
public class TestSpringBootFirstEx {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(abc.TestSpringBootFirstEx.class, args);

		  BookDAO dao = context.getBean(abc.ex1.BookDAO.class);
		  
		  dao.addBook(201, 200, "fatigue");
		  
		  dao.getAllBooks();

	}

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/bookshop");
		dmds.setUsername("root");
		dmds.setPassword("9923140389");

		return dmds;
	}

}

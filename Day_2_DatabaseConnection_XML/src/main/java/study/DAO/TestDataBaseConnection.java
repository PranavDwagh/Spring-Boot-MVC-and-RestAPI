package study.DAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDataBaseConnection {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	BookDAO bookdao =context.getBean(study.DAO.BookDAO.class);
	
	bookdao.addBook( 55, 50, "SpringFrameworks");
	
	bookdao.getAllBooks();
	
	/*
		BookDAO and Datasource file both are in a XML file ie in a classpath
	*/

	}
}
	

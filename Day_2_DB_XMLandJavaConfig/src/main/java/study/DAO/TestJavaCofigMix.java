package study.DAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestJavaCofigMix {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(study.javaConfig.MyBookConfig.class);
		BookDAO dao = context.getBean(study.DAO.BookDAO.class);
		
		dao.addBook(38, 100, "javaConfig2");
		dao.getAllBooks();
	}

}

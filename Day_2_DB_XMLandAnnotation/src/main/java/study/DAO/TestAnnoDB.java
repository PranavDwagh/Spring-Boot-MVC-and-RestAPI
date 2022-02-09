package study.DAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestAnnoDB {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("study.DAO");
		context.refresh();
		
		BookDAO dao = context.getBean(study.DAO.BookDAO.class);
		
		dao.addBook(42, 50, "Java Annotation");
		
		dao.getAllBooks();
		
	}

}

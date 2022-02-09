package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestDSJavaConfig {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(study.MyDSjavaConfig.class);
		
		context.scan("study");
		//context.refresh();     // either give java config in annotationjavacontext or say context.refresh
		BookDAO dao =  context.getBean(study.BookDAO.class);
		
		dao.addBook(105, 500, "ByJavaConfig3");
		
		dao.getAllBooks();
		
	}

}	

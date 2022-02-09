package study;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class MyAspect {

	@Pointcut("execution(int study.TestBean.add(int, int))")// pointcut given to add function only..below code execute only after you call add method
	public void thismethod() {}
	
	@Before("thismethod()")
	public void dothis()
	{
		System.out.println("here is the before call");
	}
	
	@After("thismethod()")
	public void after()
	{
		System.out.println("here is after call");
	}
	
	@Around("thismethod()")
	public Object around(ProceedingJoinPoint jp)
	{
		Object obj = null;
		System.out.println("I am around");
		
		try {
			obj = jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am after around");
		return obj;
	}
	
	
}

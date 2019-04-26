package com.aspects;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyLoggingAspect {
	private Logger logger = Logger.getLogger(getClass());

	@Before(value = "execution(* com.dao.BookDAO.*(..))")
	public void beforeAdvise(JoinPoint joinPoint) {
		logger.info("method will be invoked:- " + joinPoint.getSignature());
	}

	@After(value = "execution(* com.dao.BookDAO.*(..))")
	public void afterAdvise(JoinPoint joinPoint) {
		logger.info("method will be invoked:- " + joinPoint.getSignature());
	}

	@Around(value = "execution(* com.dao.BookDAO.addBook(..))")
	public int aroundAdvise(ProceedingJoinPoint joinPoint) {
		long start_time = System.currentTimeMillis();

		logger.info("around advise before:- " + start_time + " " + joinPoint.getSignature() + " B.L. method getting invoked");

		Integer o = null;

		try {
			o = (Integer) joinPoint.proceed();
			logger.info("No. of rows affected:- " + o);
		} catch (Throwable t) {
			t.printStackTrace();
		}

		long end_time = System.currentTimeMillis();
		logger.info("around advise after:- " + end_time + " " + joinPoint.getSignature() + " B.L. method getting invoked");

		return o;
	}

}

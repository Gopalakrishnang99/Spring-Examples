package aspect;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*@Aspect annotation marks this class as a class containing 
 * aspect methods. We need to add a bean of this type to the
 * context for spring to manage it. This aspect logs all the
 * method calls.
 */
@Component
@Aspect
public class LogAspect {
	
	private Logger logger=Logger.getLogger((LogAspect.class.getName()));
	
	/*
	 * We need to provide the condition and when to execute the aspect 
	 * which is called as the advice. @Around executes the aspect before 
	 * and after the method execution. The point expression in the value
	 * field tells to run this aspect for every method in the service 
	 * package 
	 */
	@Around("execution(* service.*.*(..))")
	public void logMethodCalls(ProceedingJoinPoint point) throws Throwable {
		logger.info("Executing "+point.getSignature().getName()+" at "+LocalDateTime.now());
		point.proceed();
		logger.info("Successfully executed "+point.getSignature().getName());
	}
	
}

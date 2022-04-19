package aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import data.UserObject;

/*
 * This aspect changes the name of the UserObject passed as
 * a parameter to upper case.
 */
@Component
@Aspect
public class ChangeNameAspect {
	
	private Logger logger=Logger.getLogger(ChangeNameAspect.class.getName());
	
	@Before("execution(* service.ServiceClass.*(data.UserObject))")
	public void changeNameToUpperCase(JoinPoint point) throws Throwable{
		Object[] args=point.getArgs();
		UserObject obj=(UserObject)args[0];
		String newName=obj.getName().toUpperCase();
		obj.setName(newName);
		logger.info("Changed name parameter and Executing "+point.getSignature().getName());
	}
}

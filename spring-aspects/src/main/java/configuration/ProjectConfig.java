package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * We need to enable the aspect using the @EnableAspectJAutoProxy
 * for aspects to work.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"data","service","aspect"})
public class ProjectConfig {
	
}

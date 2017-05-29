package tw.edu.nutc.s13023047.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Hello hello = context.getBean("hello", Hello.class);
    	hello.hello();
    	((ClassPathXmlApplicationContext) context).close();
    }
}

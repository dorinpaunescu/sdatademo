package spring.demo.dnp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dnp.demo.nic.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import spring.demo.dnp.services.BeanForTest;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		BeanForTest bean = ctx.getBean(BeanForTest.class);
		bean.test();
		System.out.println("Hello World!");
    }
}

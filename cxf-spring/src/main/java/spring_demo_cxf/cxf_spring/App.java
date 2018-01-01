package spring_demo_cxf.cxf_spring;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.raj.cxf.service.HelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 //wsdl2java -ant -client -d C:\Users\rajeev.jha\Desktop\jar\stub HelloService_wsdl.wsdl  ---- genrate client from wsdl
    	
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
    	factory.setServiceClass(HelloService.class);
    	factory.setAddress("http://localhost:8080/spring-cxf/services/HelloService");
    	
    	
    //	factory.setUsername("restuser");
    //	factory.setPassword("restuser");
    	HelloService helloService = (HelloService) factory.create();
    	 String str=helloService.sayHello("rajeev");
    	 System.out.println(str);
    }
}

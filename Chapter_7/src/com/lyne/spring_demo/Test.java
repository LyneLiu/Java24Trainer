package com.lyne.spring_demo;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 学习spring中IoC和DI的一个Demo 
 * @author nn_liu
 *
 */
@SuppressWarnings("all")
public class Test {
	
	public static void main(String[] argv) {
		
		//实例化JavaBean，主要是为了比较new对象和依赖注入两者的区别
        HelloBean hellobean=new HelloBean();
        System.out.println(hellobean.getHelloworld());
        
        // 通过Spring访问JavaBean组件
        // 这个例子仅仅是控制反转IoC的示例
        Resource resource=new ClassPathResource("com/lyne/spring_demo/Bean.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        // 获取bean
        hellobean=(HelloBean)factory.getBean("helloBean");
        System.out.println(hellobean.getHelloworld());
        
        // 通过依赖注入的方式赋值，然后获取
        hellobean.get();
	}
}

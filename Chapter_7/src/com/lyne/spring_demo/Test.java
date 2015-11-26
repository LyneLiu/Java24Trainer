package com.lyne.spring_demo;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * ѧϰspring��IoC��DI��һ��Demo 
 * @author nn_liu
 *
 */
@SuppressWarnings("all")
public class Test {
	
	public static void main(String[] argv) {
		
		//ʵ����JavaBean����Ҫ��Ϊ�˱Ƚ�new���������ע�����ߵ�����
        HelloBean hellobean=new HelloBean();
        System.out.println(hellobean.getHelloworld());
        
        // ͨ��Spring����JavaBean���
        // ������ӽ����ǿ��Ʒ�תIoC��ʾ��
        Resource resource=new ClassPathResource("com/lyne/spring_demo/Bean.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        // ��ȡbean
        hellobean=(HelloBean)factory.getBean("helloBean");
        System.out.println(hellobean.getHelloworld());
        
        // ͨ������ע��ķ�ʽ��ֵ��Ȼ���ȡ
        hellobean.get();
	}
}

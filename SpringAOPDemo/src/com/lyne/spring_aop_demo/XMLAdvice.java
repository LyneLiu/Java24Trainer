package com.lyne.spring_aop_demo;

import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.ProceedingJoinPoint;  
  
/** 
 * Advice֪ͨ�� 
 * ����after,before,around,throwing,returning Advice. 
 * 
 */  
public class XMLAdvice {  
  
    /** 
     * �ں���ҵ��ִ��ǰִ�У�������ֹ����ҵ��ĵ��á� 
     * @param joinPoint 
     */  
    private void doBefore(JoinPoint joinPoint) {  
        System.out.println("-----doBefore().invoke-----");  
        System.out.println(" �˴�����ִ�к���ҵ���߼�ǰ����һЩ��ȫ�Ե��жϵȵ�");  
        System.out.println(" ��ͨ��joinPoint����ȡ����Ҫ������");  
        System.out.println("-----End of doBefore()------");  
    }  
      
    /** 
     * �ֶ����Ƶ��ú���ҵ���߼����Լ�����ǰ�͵��ú�Ĵ���, 
     *  
     * ע�⣺������ҵ�����쳣�������˳���ת��After Advice 
     * ִ�����After Advice����ת��Throwing Advice 
     * @param pjp 
     * @return 
     * @throws Throwable 
     */  
    private Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
        System.out.println("-----doAround().invoke-----");  
        System.out.println(" �˴�������������Before Advice������");  
          
        //���ú����߼�  
        Object retVal = pjp.proceed();  
          
        System.out.println(" �˴�������������After Advice������");  
        System.out.println("-----End of doAround()------");  
        return retVal;  
    }  
  
    /** 
     * ����ҵ���߼��˳��󣨰�������ִ�н������쳣�˳�����ִ�д�Advice 
     * @param joinPoint 
     */  
    private void doAfter(JoinPoint joinPoint) {  
        System.out.println("-----doAfter().invoke-----");  
        System.out.println(" �˴�����ִ�к���ҵ���߼�֮����һЩ��־��¼�����ȵ�");  
        System.out.println(" ��ͨ��joinPoint����ȡ����Ҫ������");  
        System.out.println("-----End of doAfter()------");  
    }  
      
    /** 
     * ����ҵ���߼����������˳��󣬲����Ƿ��з���ֵ�������˳��󣬾�ִ�д�Advice 
     * @param joinPoint 
     */  
    private void doReturn(JoinPoint joinPoint) {  
        System.out.println("-----doReturn().invoke-----");  
        System.out.println(" �˴����ԶԷ���ֵ����һ������");  
        System.out.println(" ��ͨ��joinPoint����ȡ����Ҫ������");  
        System.out.println("-----End of doReturn()------");  
    }  
      
    /** 
     * ����ҵ���߼������쳣�˳���ִ�д�Advice�����������Ϣ 
     * @param joinPoint 
     * @param ex 
     */  
    private void doThrowing(JoinPoint joinPoint,Throwable ex) {  
        System.out.println("-----doThrowing().invoke-----");  
        System.out.println(" ������Ϣ��"+ex.getMessage());  
        System.out.println(" �˴�����ִ�к���ҵ���߼�����ʱ�������쳣��������һЩ��־��¼�����ȵ�");  
        System.out.println(" ��ͨ��joinPoint����ȡ����Ҫ������");  
        System.out.println("-----End of doThrowing()------");  
    }  
}  
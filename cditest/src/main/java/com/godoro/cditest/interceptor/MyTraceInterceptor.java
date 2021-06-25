package com.godoro.cditest.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;



@MyTraceBinding		//Herhangi bir nesne bu anatasyonla işaretlenirse, Ben onun yolunu KESERİM demektir
@Interceptor
public class MyTraceInterceptor {

	
	
	@AroundInvoke
	public Object handle(InvocationContext context) {
		
		System.out.println("Çağrılan Yöntem : "+context.getMethod().getName());
		Object result=null;
		try {
			result = context.proceed();
			System.out.println("Dönen Sonuç : "+result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}

package com.godoro.cditest.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;



@MyCountBinding( ascending = true)
@Interceptor
public class MyCountInterceptorAscending {
	
	private int count = 10;
	
	@AroundInvoke
	public Object handle(InvocationContext context) {
		System.out.println("Çağrılan Yöntem : "+context.getMethod().getName());		
		Object result = null;
		
		try {
			result = context.proceed();
			count++;
			System.out.println("Sayaç : "+count);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return result;
	}
	
}

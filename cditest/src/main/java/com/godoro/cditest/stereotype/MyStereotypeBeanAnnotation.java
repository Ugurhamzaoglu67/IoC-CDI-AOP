package com.godoro.cditest.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.context.ApplicationScoped;

import javax.enterprise.inject.Stereotype;
import javax.inject.Named;

import com.godoro.cditest.interceptor.MyCombinedBinding;
import com.godoro.cditest.interceptor.MyTraceBinding;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;



@Named
@ApplicationScoped
@MyCombinedBinding(ascending = false)
@MyTraceBinding
@Stereotype
@Target({ TYPE })
@Retention(RUNTIME)
@Documented
public @interface MyStereotypeBeanAnnotation {

}

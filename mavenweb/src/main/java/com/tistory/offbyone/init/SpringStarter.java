package com.tistory.offbyone.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 스프링프레임워크 시작파일
 */
public class SpringStarter implements WebApplicationInitializer {

	/**
	 * 컨텍스트를 시작한다.
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// Root Context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(com.tistory.offbyone.init.RootContextConfiguration.class);
		servletContext.addListener(new ContextLoaderListener(rootContext));
		
	    // Web Context
	    AnnotationConfigWebApplicationContext dispatcherContext =  new AnnotationConfigWebApplicationContext();
	    dispatcherContext.register(WebContextConfiguration.class);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
	    dispatcher.setLoadOnStartup(1);
	    dispatcher.addMapping("*.do");
	}
}

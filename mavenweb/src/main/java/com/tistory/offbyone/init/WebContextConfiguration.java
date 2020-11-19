package com.tistory.offbyone.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 웹 컨텍스트 설정파일
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.tistory.offbyone.web"})
public class WebContextConfiguration  implements WebMvcConfigurer {
	
	/**
	 * 뷰 리졸버를 설정한다.
	 * @return
	 */
    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}

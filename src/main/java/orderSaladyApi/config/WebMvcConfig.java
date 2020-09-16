package orderSaladyApi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	@Autowired
	private HandlerInterceptorAdapter interceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(interceptor).addPathPatterns("/", "/admin/**", "/user/**");
	}
}
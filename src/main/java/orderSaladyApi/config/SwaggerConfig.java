package orderSaladyApi.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Configuration
public class SwaggerConfig {
	@Primary
	@Bean
	public SwaggerResourcesProvider swaggerResoucresProvider(){
		return () -> {
			List<SwaggerResource> resources=new ArrayList<>();
			Arrays.asList("swagger").forEach(resourceName -> resources.add(loadResoucre(resourceName)));
			return resources;
		};
	}

	//파일 별로 사용 시 사용
	private SwaggerResource loadResoucre(String resource){
		SwaggerResource wsResource=new SwaggerResource();
		wsResource.setName(resource);
		wsResource.setSwaggerVersion("2.0");
		wsResource.setLocation("/swagger/"+resource+".yaml");
		return wsResource;
	}
}
package orderSaladyApi;

import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OrderSaladyApiApplication {
	public static void main(String[] args){
		SpringApplication.run(OrderSaladyApiApplication.class, args);
	}
	
	@Bean
	public Docket swagger(){
		new Docket(SWAGGER_2).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
		return null;
	}
}
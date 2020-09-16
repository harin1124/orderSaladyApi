package orderSaladyApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaAuditing
//@EntityScan(basePackageClasses={Jsr310JpaConverters.class}, basePackages={"orderSaladyApi"})
public class OrderSaladyApiApplication {
	public static void main(String[] args){
		SpringApplication.run(OrderSaladyApiApplication.class, args);
	}
}
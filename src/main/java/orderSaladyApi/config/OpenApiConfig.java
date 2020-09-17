package orderSaladyApi.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
	info=@Info(
		title="orderSaladyApi 명세서",
		description="API 명세서",
		version="v0.0.1",
		contact = @Contact(name="hr1124", email="lolrin1124@gmail.com"),
		license = @License(name="Apache 2.0", url="http://www.apache.org/licenses/LICENSE-2.0.html")
	)
)

@Configuration
public class OpenApiConfig {
	/**
	 * adminApi.
	 * @return GroupedOpenApi
	 */
	@Bean
	public GroupedOpenApi adminApi() {
		String[] paths={"/admin/**"};
		return GroupedOpenApi.builder().setGroup("어드민 관련 API").pathsToMatch(paths).build();
	}
}
package orderSaladyApi;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderSaladyApiApplicationTests {
	@Test
	public void 불능검사()throws Exception{
		System.out.println(4/0);
	}
}
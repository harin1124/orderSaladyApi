package orderSaladyApi.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaladyMenuController {
	@GetMapping("/menu/list")
	public HashMap<String, Object> menu(@RequestParam("userId") String userId){
		System.out.println("파라미터 userId : "+userId);
		HashMap<String, Object> returnMap=new HashMap<String, Object>();
		returnMap.put("메뉴명", "샐러디");
		return returnMap;
	}
	@PostMapping("/menu/list2")
	public HashMap<String, Object> list(@RequestBody HashMap<String, Object> paramMap){
		System.out.println("paramMap : "+paramMap);
		HashMap<String, Object> returnMap=new HashMap<String, Object>();
		returnMap.put("RESULT", "SUCCESS");
		return returnMap;
	}
}
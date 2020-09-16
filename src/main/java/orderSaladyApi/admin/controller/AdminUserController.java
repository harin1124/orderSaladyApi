package orderSaladyApi.admin.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import orderSaladyApi.admin.service.AdminUserService;

@RestController
@RequestMapping("/admin/user")
public class AdminUserController {
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	AdminUserService adminUserService;
	
	@PostMapping("/login")
	public HashMap<String, Object> loginSelect(@RequestBody HashMap<String, Object> paramMap)throws Exception{
		HashMap<String, Object> resultMap=new HashMap<String, Object>();
		log.debug("PARAM_MAP : "+paramMap);
		resultMap=adminUserService.loginSelect(paramMap);
		return resultMap;
	}
	
	@PostMapping("/join")
	public int joinInsert(@RequestBody HashMap<String, Object> paramMap)throws Exception{
		log.debug("PARAM_MAP : "+paramMap);
		int returnResult=adminUserService.joinInsert(paramMap);
		return returnResult;
	}
}
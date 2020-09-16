package orderSaladyApi.admin.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orderSaladyApi.admin.dto.AdminInfoDto;
import orderSaladyApi.admin.mapper.AdminUserMapper;

@Service
public class AdminUserService {
	@Autowired
	AdminUserMapper adminUserMapper;
	
	public HashMap<String, Object> loginSelect(HashMap<String, Object> paramMap)throws Exception{
		AdminInfoDto adminInfo=new AdminInfoDto();
		adminInfo.setUserId(paramMap.get("userId").toString());
		adminInfo.setUserPassword(paramMap.get("userPassword").toString());
		
		return adminUserMapper.getUser(adminInfo);
		
	}
	
	public int joinInsert(HashMap<String, Object> paramMap)throws Exception{
		AdminInfoDto adminInfo=new AdminInfoDto();
		adminInfo.setUserId(paramMap.get("userId").toString());
		adminInfo.setUserPassword(paramMap.get("userPassword").toString());
		int result=adminUserMapper.joinInsert(adminInfo);
		return result;
	}
}
package orderSaladyApi.admin.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import orderSaladyApi.admin.dto.AdminInfoDto;

@Mapper
public interface AdminUserMapper {
	HashMap<String, Object> getUser(AdminInfoDto adminInfoDto)throws Exception;
	
	int joinInsert(AdminInfoDto adminInfoDto)throws Exception;
}
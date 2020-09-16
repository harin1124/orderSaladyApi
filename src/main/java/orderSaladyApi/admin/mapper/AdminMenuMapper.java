package orderSaladyApi.admin.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import orderSaladyApi.dto.SaladyMenuDto;

@Mapper
public interface AdminMenuMapper {
	ArrayList<HashMap<String, Object>> getMenuTypeList(HashMap<String, Object> paramMap)throws Exception;
	
	int insertSaladyMenu(SaladyMenuDto saladyMenuDto)throws Exception;
	
	ArrayList<HashMap<String, Object>> getMenuList(HashMap<String, Object> paramMap)throws Exception;
	
	int getMenuListCount()throws Exception;
	
	HashMap<String, Object> getMenuInfo(HashMap<String, Object> paramMap)throws Exception;
}
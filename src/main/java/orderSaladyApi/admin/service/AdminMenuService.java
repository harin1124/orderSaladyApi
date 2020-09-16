package orderSaladyApi.admin.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;
import orderSaladyApi.admin.mapper.AdminMenuMapper;
import orderSaladyApi.domain.ResponseDto;
import orderSaladyApi.dto.SaladyMenuDto;
import orderSaladyApi.util.PagingUtil;

@Service
@RequiredArgsConstructor
public class AdminMenuService {
	private final AdminMenuMapper adminMenuMapper;
	
	public String menuTypeSelect(HashMap<String, Object> paramMap){
		ArrayList<HashMap<String, Object>> menuTypeList=new ArrayList<HashMap<String, Object>>();
		String returnResult="";
		try{
			menuTypeList=adminMenuMapper.getMenuTypeList(paramMap);
			HashMap<String, Object> msg=new HashMap<String, Object>();
			msg.put("menuTypeList", menuTypeList);
			returnResult=ResponseDto.getJson(200, "OK", false, msg);
			/*
			resDto.setMessage(msg);
			returnMsg.setState_code(200);
			returnMsg.setState_msg("OK");
			returnMsg.setInvalid(false);
			*/
		}catch(Exception e){
			e.getStackTrace();
			// 밸리데이션 가정 하에.
			// 트랜잭션 에러 >> 500
			
			
			// 4 / 0 >> 500
			
			// Exception 분리 작업 진행.. 쿼리 강제 오류 발생시킬 것
			returnResult=ResponseDto.getJson(0, "ERROR", false, null);
			/*
			returnMsg.setMessage(null);
			returnMsg.setState_code(0);
			returnMsg.setState_msg("ERROR");
			*/
		}
		//return new Gson().toJson(returnMsg);
		// ==============================
		return returnResult;
	}
	
	public ArrayList<HashMap<String, Object>> menuListSelect(HashMap<String, Object> paramMap)throws Exception{
		ArrayList<HashMap<String, Object>> returnList=new ArrayList<HashMap<String, Object>>();
		//OPTION_PAGE_CONTENT_SIZE
		if(paramMap.get("OPTION_PAGE_CONTENT_SIZE")!=null && !"".equals(paramMap.get("OPTION_PAGE_CONTENT_SIZE").toString())){
			paramMap.put("OPTION_PAGE_CONTENT_SIZE", 10);
		}
		
		//PAGE_NO
		if(paramMap.get("PAGE_NO")==null){
			paramMap.put("PAGE_NO", 0);
		}else{
			int PAGE_NO=(Integer.valueOf(paramMap.get("PAGE_NO").toString())-1)*10;
			paramMap.put("PAGE_NO", PAGE_NO);
		}
		
		returnList=adminMenuMapper.getMenuList(paramMap);
		return returnList;
	}
	
	public HashMap<String, Object> menuListPagingInfoSelect(HashMap<String, Object> paramMap)throws Exception{
		if(paramMap.get("OPTION_PAGE_CONTENT_SIZE")!=null && !"".equals(paramMap.get("OPTION_PAGE_CONTENT_SIZE").toString())){
			paramMap.put("OPTION_PAGE_CONTENT_SIZE", 10);
		}
		paramMap.put("PAGE_NO", (paramMap.get("PAGE_NO")==null)?1:paramMap.get("PAGE_NO"));
		
		//전체 게시글 수
		int totalCount=adminMenuMapper.getMenuListCount();
		
		//페이징 정보 생성
		PagingUtil paging=new PagingUtil((int)paramMap.get("PAGE_NO"),totalCount, (int)paramMap.get("OPTION_PAGE_CONTENT_SIZE"));
		return paging.getPagingInfo();
	}
	
	
	public int menuRegisteInsert(SaladyMenuDto saladyMenuDto)throws Exception{
		return adminMenuMapper.insertSaladyMenu(saladyMenuDto);
	}
	
	public HashMap<String, Object> menuInfoSelect(int rowSeq)throws Exception{
		HashMap<String, Object> paramMap=new HashMap<String, Object>();
		paramMap.put("ROW_SEQ", rowSeq);
		return adminMenuMapper.getMenuInfo(paramMap);
	}
	
	public String menuUpdateUpdate(){
		//쿼리 처리 했다고 가정
		HashMap<String, Object> msg=new HashMap<String, Object>();
		msg.put("update_count", 1);
		return ResponseDto.getJson(200, "OK", false, msg);
	}
}
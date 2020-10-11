package orderSaladyApi.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import orderSaladyApi.admin.service.AdminMenuService;
import orderSaladyApi.dto.SaladyMenuDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/menu")
public class AdminMenuController {
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	private final AdminMenuService adminMenuService;
	
	// 메뉴 타입
	/*
	/*@ApiResponses(value={
		@ApiResponse()
	})*/
	//@ApiOperation(value = "getGreeting!", nickname = "getGreeting")
	@GetMapping("/menu-type-list")
	public String menuTypeSelect(HashMap<String, Object> paramMap)throws Exception{
		log.debug("PARAM MAP : "+paramMap);
		return adminMenuService.menuTypeSelect(paramMap);
	}
	
	// 메뉴 목록
	@PostMapping("/menu-list")
	public ArrayList<HashMap<String, Object>> menuListSelect(@RequestBody HashMap<String, Object> paramMap)throws Exception{
		log.debug("PARAM MAP : "+paramMap);
		return adminMenuService.menuListSelect(paramMap);
	}
	
	// 메뉴 목록 페이징
	@PostMapping("/menu-list/paging")
	public HashMap<String, Object> menuListPagingInfoSelect(@RequestBody HashMap<String, Object> paramMap)throws Exception{
		log.debug("PARAM MAP :"+paramMap);
		return adminMenuService.menuListPagingInfoSelect(paramMap);
	}
	
	// 저장
	@PostMapping("/save")
	public int menuRegisteInsert(@RequestBody HashMap<String, Object> paramMap)throws Exception{
		log.debug("PARAM MAP :"+paramMap);
		
		//DTO SETTING
		SaladyMenuDto saladyMenuDto=new SaladyMenuDto(paramMap);
		System.out.println("SALADYMENUDTO : "+saladyMenuDto);
		adminMenuService.menuRegisteInsert(saladyMenuDto);
		return 0;
	}
	
	// 메뉴 정보
	@GetMapping("/{rowSeq}")
	public HashMap<String, Object> menuInfoSelect(@PathVariable int rowSeq)throws Exception{
		return adminMenuService.menuInfoSelect(rowSeq);
	}
	
	// 수정
	@PutMapping("/update")
	public String menuUpdateUpdate(@RequestBody HashMap<String, Object> paramMap)throws Exception{
		log.debug("PARAM MAP :"+paramMap);
		return adminMenuService.menuUpdateUpdate();
	}
}
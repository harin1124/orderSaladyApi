package orderSaladyApi.admin.dto;

import java.util.HashMap;

import lombok.Data;

@Data
public class AdminInfoDto {
	//유저번호
	private int rowId;
	//아이디
	private String userId;
	//비밀번호
	private String userPassword;
	//유저명
	private String userName;
	//가입일
	private String regDate;
	//삭제여부
	private String delYn;
	//삭제일
	private String delDate;
	
	public AdminInfoDto(){}
	
	public HashMap<String, Object> getHashMap(){
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("rowId", (rowId!=0)?rowId:0);
		map.put("userId", (userId!=null)?userId:null);
		map.put("userPassword", (userPassword!=null)?userPassword:null);
		map.put("userName", (userName!=null)?userName:null);
		map.put("regDate", (regDate!=null)?regDate:null);
		map.put("delYn", (delYn!=null)?delYn:null);
		map.put("delDate", (delDate!=null)?delDate:null);
		return map;
	}
	
	public HashMap<String, Object> getSafeHashMap(){
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("rowId", (rowId!=0)?rowId:0);
		map.put("userId", (userId!=null)?userId:null);
		map.put("userName", (userName!=null)?userName:null);
		map.put("regDate", (regDate!=null)?regDate:null);
		return map;
	}
}
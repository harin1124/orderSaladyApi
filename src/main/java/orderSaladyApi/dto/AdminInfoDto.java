package orderSaladyApi.dto;

import lombok.Data;

@Data
public class AdminInfoDto {
	//유저번호
	private int rowSeq;
	//아이디
	private String userId;
	//비밀번호
	private String userPassword;
	//유저명
	private String userName;
	//가입일
	private String regDate;
	//사용여부
	private int useYn;
	//삭제여부
	private int delYn;
	//삭제일
	private String delDate;
	//최고관리자 여부
	private int topManagerYn;
	
	public AdminInfoDto(){}
}
package orderSaladyApi.dto;

import java.util.HashMap;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
//메뉴 정보
public class SaladyMenuDto extends CommonDto{
	//고유값
	private int rowSeq;
	//한글명
	private String koName;
	//영문명
	private String enName;
	//설명
	private String menuDesc;
	//가격
	private String price;
	//판매
	private String saleYn;
	//판매 기간
	private String salePeriodYn;
	//판매 시작일
	private String saleStartDate;
	//판매 종료일
	private String saleEndDate;
	//할인
	private String discountYn;
	//할인가
	private String discountPrice;
	//할인 기간
	private String discountPeriodYn;
	//할인 시작일
	private String discountStartDate;
	//할인 종료일
	private String discountEndDate;
	//용량
	private String capacity;
	//칼로리
	private String calories;
	//탄수화물
	private String carbohydrate;
	//당류
	private String sugar;
	//단백질
	private String protein;
	//지방
	private String fat;
	//트랜스지방
	private String transFat;
	//포화지방
	private String saturatedFat;
	//콜레스테롤
	private String cholesterol;
	//나트륨
	private String sodium;
	//등록일
	private String regDate;
	//삭제
	private String delYn;
	//삭제일
	private String delDate;
	
	public SaladyMenuDto(){}
	
	// MAP 받아서 DTO로 변환
	public SaladyMenuDto(HashMap<String, Object> p){
		this.koName=getString(p.get("KO_NAME"));
		this.enName=getString(p.get("EN_NAME"));
		this.menuDesc=getString(p.get("MENU_DESC"));
		this.price=getString(p.get("PRICE"));
		this.saleYn=getString(p.get("SALE_YN"));
		this.salePeriodYn=getYN(p.get("SALE_PERIOD_YN"));
		this.saleStartDate=getString(p.get("SALE_START_DATE"));
		this.saleEndDate=getString(p.get("SALE_END_DATE"));
		
		this.discountYn=getYN(p.get("DISCOUNT_YN"));
		this.discountPrice=getString(p.get("DISCOUNT_PRICE"));
		this.discountPeriodYn=getYN(p.get("DISCOUNT_PERIOD_YN"));
		this.discountStartDate=getString(p.get("DISCOUNT_START_DATE"));
		this.discountEndDate=getString(p.get("DISCOUNT_END_DATE"));
		
		this.capacity=getString(p.get("CAPACITY"));
		this.calories=getString(p.get("CALORIES"));
		this.carbohydrate=getString(p.get("CARBOHYDRATE"));
		this.sugar=getString(p.get("SUGAR"));
		this.protein=getString(p.get("PROTEIN"));
		this.fat=getString(p.get("FAT"));
		this.transFat=getString(p.get("TRANS_FAT"));
		this.saturatedFat=getString(p.get("SATURATED_FAT"));
		this.cholesterol=getString(p.get("CHOLESTEROL"));
		this.sodium=getString(p.get("SODIUM"));
		
		this.regDate=getString(p.get("REG_DATE"));
		this.delYn=getYN(p.get("DEL_YN"));
		this.delDate=getString(p.get("DEL_DATE"));
	}
}
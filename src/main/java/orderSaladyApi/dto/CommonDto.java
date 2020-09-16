package orderSaladyApi.dto;

public class CommonDto {
	protected String getString(Object v){
		return (v!=null)?v.toString():null;
	}
	protected int getInt(Object v){
		return (v!=null && !"".equals(v.toString()))?Integer.valueOf(v.toString()):0;
	}
	protected String getYN(Object v){
		if(v==null){
			return null;
		}else{
			String val=v.toString();
			if("".equals(val) && ("Y".equals(val) || "N".equals(val))){
				return val;
			}else{
				return null;
			}
		}
	}
}
package orderSaladyApi.domain;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

public class ResponseDto<T> {
	@Autowired
	Gson gson;

	private Integer http_state;
	private String state_msg;
	private Boolean invalid;
	private T message;
	
	
	public ResponseDto(){}
	
	/**
	 * @param state_code : HTTP STATE CODE 값
	 * @param state_msg : message
	 * @param invalid : 유효성 검사에 부적절한지. (부적절=true)
	 * @param message : 응답 컨텐츠
	 */
	public ResponseDto(int http_state, String state_msg, boolean invalid, T message){
		this.http_state=http_state;
		this.state_msg=state_msg;
		this.invalid=invalid;
		this.message=message;
	}

	public ResponseDto<T> setHttpState(int http_state){
		this.http_state=http_state;
		return this;
	}
	public ResponseDto<T> setStateMsg(String state_msg){
		this.state_msg=state_msg;
		return this;
	}
	public ResponseDto<T> setInvalid(boolean invalid){
		this.invalid=invalid;
		return this;
	}
	public ResponseDto<T> setMessage(T message){
		this.message=message;
		return this;
	}
	
	public static <T> ResponseDto<T> set(int http_state, String state_msg, boolean invalid, T message){
        return new ResponseDto<>(http_state, state_msg, invalid, message);
	}
	
	public static <T> String getJson(int http_state, String state_msg, boolean invalid, T message){
		return new Gson().toJson(new ResponseDto<>(http_state, state_msg, invalid, message));
	}
	
	public String okJson(int http_state, T message){
		return new Gson().toJson(this.setHttpState(http_state).setStateMsg("OK").setInvalid(false).setMessage(message));
	}
	
	public String errorJson(int http_state, boolean invalid){
		return new Gson().toJson(this.setHttpState(http_state).setStateMsg("ERROR").setInvalid(invalid));
		
	}
}
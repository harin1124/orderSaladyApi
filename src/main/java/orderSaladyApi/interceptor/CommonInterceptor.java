package orderSaladyApi.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class CommonInterceptor extends HandlerInterceptorAdapter {
	//private final Logger log=LoggerFactory.getLogger(HandlerInterceptorAdapter.class);
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler){
		// 매핑 전
		System.out.println("=====================================================");
		System.out.println("URI    |   "+req.getRequestURI());
		System.out.println("METHOD |   "+req.getMethod());
		System.out.println("ADDR   |   "+req.getHeader("X-FORWARDED-FOR"));
		//System.out.println(request.getRemoteAddr());
		System.out.println("=====================================================");
		
		// TODO : 여기에 파라미터도 넘어오게 하는 법이 없을까? keyset 같은 반복문 말고.
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndView){
		// 매핑 후
	}
	
	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex){
		// 모든 작업 완료 후
	}
}
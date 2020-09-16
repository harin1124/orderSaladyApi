package orderSaladyApi.log;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class LogbackFilter extends Filter<ILoggingEvent>{
	@Override
	public FilterReply decide(ILoggingEvent e){
		System.out.println(e.getLoggerName());
		return FilterReply.ACCEPT;
	}
}
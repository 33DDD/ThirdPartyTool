package autoit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerDemo {
	
	public Logger log = Logger.getLogger(LoggerDemo.class);
	
	
	public void loggerDebug()
	{
		log.debug("This is a debug method");
	}
	
	public void loggerInfo()
	{
		log.info("This is information about AUT");// AUT Application Under Test
	}

	public void loggerError()
	{
		log.error("This is your error message");
	}
	
	public void loggerFatal()
	{
		log.fatal("This is your fatal message");
	}
	
	public void loggerWarn()
	{
		log.warn("This is your warn meassage");
	}
	@Test
	public void loggerDemo() 
	{
		loggerDebug();
		loggerInfo();
		loggerError();
		loggerFatal();
		loggerWarn();
		
	}
		
		
		
		
		
		
		
		
		
	}
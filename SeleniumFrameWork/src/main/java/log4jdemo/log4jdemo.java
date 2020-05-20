package log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {
	
	private static Logger logger=LogManager.getLogger(log4jdemo.class); 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n  Hello Welcome    \n");
		logger.trace("This is a trace message"); 
		logger.info("this is a message to verify");
		 logger.error("this an error message");
		 logger.warn("Warning message");
	
	System.out.println("Task completed");
	
	}

}

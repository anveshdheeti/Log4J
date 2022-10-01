package in.log4j;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerClass {

	private static Logger logger = Logger.getLogger(LoggerClass.class);

	public static void main(String[] args) throws FileNotFoundException {

		PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "log4j.properties");

		logger.trace("this is trace message");
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.error("this is error message");
		logger.fatal("this is fatal message");
	}

}

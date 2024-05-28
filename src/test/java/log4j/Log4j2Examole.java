package log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4j2Examole {
	
	
	    private static final Logger LOGGER = LogManager.getLogger(Log4j2Examole.class);

	    public static void main(String[] args) {
	        LOGGER.info("This is an INFO level log message.");
	        LOGGER.error("This is an ERROR level log message.");
	    }
	}


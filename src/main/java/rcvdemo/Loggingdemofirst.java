package rcvdemo;
import org.apache.logging.log4j.*;

public class Loggingdemofirst {

    private static Logger demologger = LogManager.getLogger(Loggingdemofirst.class.getName());

    public static void main(String[] args) {
        demologger.info("click successful");
        demologger.error(" DB connection failed");
        demologger.fatal("This is fatal");


    }
}

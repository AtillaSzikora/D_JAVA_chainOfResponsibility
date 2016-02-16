package codecool.logger;

public class ChainPatternDemo {

    public static void main(String[] args) {
        AbstractLogger consolLogger = new ConsolLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        consolLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        consolLogger.logMessage(AbstractLogger.INFO, "This is info.");
        consolLogger.logMessage(AbstractLogger.DEBUG, "This is debug info.");
        consolLogger.logMessage(AbstractLogger.ERROR, "Caffee ran out.");
    }
}

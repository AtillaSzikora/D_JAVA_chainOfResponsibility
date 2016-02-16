package codecool.logger;

public class ChainPatternDemo {
    public static AbstractLogger getLoggerChain() {
        AbstractLogger consoleLogger = new ConsolLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
        return consoleLogger; }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getLoggerChain();
        loggerChain.logMessage(AbstractLogger.INFO, "This is info.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug info.");
        loggerChain.logMessage(AbstractLogger.ERROR, "Caffee ran out."); }
}
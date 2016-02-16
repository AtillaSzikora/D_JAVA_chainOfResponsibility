package codecool.logger;

public class ErrorLogger extends AbstractLogger {

    @Override public void write(String message) {
        System.err.println("[ERROR] " + message); }

    public ErrorLogger(int level) {
        super();
        this.level = level;}
}
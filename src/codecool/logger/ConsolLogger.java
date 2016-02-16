package codecool.logger;

public class ConsolLogger extends AbstractLogger {

    @Override public void write(String message) {
        System.out.println("[Console] " + message); }

    public ConsolLogger(int level) {this.level = level;}
}
package codecool.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {}

    @Override public void write(String message) {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            Calendar.getInstance().getTime();
            writer.write(Calendar.getInstance().getTime() + message);
            writer.close(); }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

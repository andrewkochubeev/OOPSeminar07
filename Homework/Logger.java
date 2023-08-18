package Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public void logResult(Complex res) {
        File logFile = new File("log.txt");
        try (FileWriter fileWriter = new FileWriter(logFile, true)) {
            fileWriter.write("Result: " + res + "\n");
            fileWriter.flush();
        } catch (IOException ex) {

        }

    }
}

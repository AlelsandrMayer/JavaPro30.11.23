package org.example.hw20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import static org.example.hw20.LoggingLevel.DEBUG;
import static org.example.hw20.LoggingLevel.INFO;

public class FileLogger {
    private FileLoggerConfiguration config;
    private File logFile;
    private long currentSize;
    private FileWriter writer;
    private int count;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy-HH.mm");


    public FileLogger(FileLoggerConfiguration config) throws IOException, FileMaxSizeReachedException {
        this.config = config;
        this.logFile = new File("'" + count++ + "'" + config.getFile() + dateFormat.format(new Date()) + ".txt");
        this.currentSize = logFile.length();
        this.writer = new FileWriter(logFile, true);
    }

    public void debug(String message) throws IOException {
        if (config.getLevel() == DEBUG) {
            String logMessage = String.format(config.getFormat(), LocalDateTime.now(), DEBUG, message);
            writeLog(logMessage);
        }
    }

    public void info(String message) throws IOException {
        if (config.getLevel() == INFO || config.getLevel() == DEBUG) {
            String logMessage = String.format(config.getFormat(), LocalDateTime.now(), INFO, message);
            writeLog(logMessage);
        }
    }

    private void writeLog(String message) throws IOException {

        if (currentSize + message.length() > config.getSize()) {

            File newLogFile = new File("'" + count++ + "'" + config.getFile() + dateFormat.format(new Date()) + ".txt");
            writer.close();

            writer = new FileWriter(newLogFile, true);
            logFile = newLogFile;
            currentSize = 0;
        }
        writer.write(message + "\n");
        writer.flush();
        currentSize += message.length();
    }
}

package org.example.hw20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileLoggerConfigurationLoader {
    static FileLoggerConfiguration load(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String fileLine;
        String logFile = "";
        LoggingLevel logLevel = null;
        long maxSize = 0;
        String format = "";


        while ((fileLine = br.readLine()) != null) {
            String[] parts = fileLine.split(":");
            if (parts.length != 2) {
                continue;
            }
            String key = parts[0].trim();
            String value = parts[1].trim();

            switch (key) {
                case "FILE":
                    logFile = value;
                    break;
                case "LEVEL":
                    logLevel = LoggingLevel.valueOf(value.toUpperCase());
                    break;
                case "MAX-SIZE":
                    maxSize = Long.parseLong(value);
                    break;
                case "FORMAT":
                    format = value;
                    break;
            }
        }

        br.close();

        return new FileLoggerConfiguration(logFile, logLevel, maxSize, format);
    }
}

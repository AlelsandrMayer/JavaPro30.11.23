package org.example.hw20;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileLoggerConfiguration config = FileLoggerConfigurationLoader.load("logger-config.txt");

            FileLogger logger = new FileLogger(config);

            logger.info("This is an info message");
            logger.info("This is an info message");
            logger.info("This is an info message");
            logger.info("This is an info message");

            logger.debug("This is a debug message");
            logger.debug("This is a debug message");
            logger.debug("This is a debug message");
            logger.debug("This is a debug message");
            logger.debug("This is a debug message");
            logger.debug("This is a debug message");


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileMaxSizeReachedException e) {
            throw new RuntimeException(e);
        }
    }
}

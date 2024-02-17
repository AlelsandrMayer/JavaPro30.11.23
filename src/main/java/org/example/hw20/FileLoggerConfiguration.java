package org.example.hw20;

public class FileLoggerConfiguration {
    private String file;
    private LoggingLevel level;
    private long size;
    private String format;

    public FileLoggerConfiguration(String file, LoggingLevel level, long size, String format) {
        this.file = file;
        this.level = level;
        this.size = size;
        this.format = format;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

package Aufgabe01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLogger implements Logger{
    private String fileName;

    private static SimpleLogger _instance = new SimpleLogger();


    private SimpleLogger(){}

    public static SimpleLogger get_instance() {
        if (_instance == null){
            _instance = new SimpleLogger();
        }

        return _instance;
    }
    public void Logger(String filetName){
        this.fileName = filetName;
    }
    public void Logger(){
        this.fileName ="log.txt";
    }

    @Override
    public void log(String message) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logEntery = String.format("%s [%s]", timeStamp, message);

        System.out.println(logEntery);

        try(FileOutputStream fos = new FileOutputStream(fileName, true)){
            fos.write((logEntery + System.lineSeparator()).getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void log(String message, LogLevel severity) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logEntery = String.format("%s [%s] %s", timeStamp, severity, message);
        System.out.println(logEntery);

        try(FileOutputStream fos = new FileOutputStream(fileName, true)){
            fos.write((logEntery + System.lineSeparator()).getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

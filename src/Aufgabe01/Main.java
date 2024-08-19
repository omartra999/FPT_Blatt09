package Aufgabe01;

public class Main {
    public static void main(String[] args) {
        SimpleLogger.get_instance().Logger("logger.txt");
        SimpleLogger.get_instance().log("Hello world", LogLevel.TEST);
        SimpleLogger.get_instance().log("another message");
    }
}

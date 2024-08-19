package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<String> strings = new ArrayList();
        List<String> other = new ArrayList<>();


        strings.add("1");
        strings.add("l");
        other.add("1");
        other.add("l");

        System.out.println( strings == other);
    }
}

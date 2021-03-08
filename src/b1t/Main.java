/*
    Jackson Meyer
    Dec 2020

 */

package b1t;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("b1t.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }



    public static void main(String[] args) {
//        launch(args);
        Calculator calc = new Calculator();
        System.out.println("Answer: " + calc.binary_to_dec("100110010011001010111011"));
    }
}

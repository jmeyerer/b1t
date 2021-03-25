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
        String binary_input = "1101001111";

        System.out.println("binary_input: " + binary_input);
        System.out.println();

        System.out.println("binary_to_dec: " + calc.binary_to_dec(binary_input));
        System.out.println("binary_to_hex: " + calc.binary_to_hex(binary_input));
        System.out.println();


        String dec_input = "9167";

        System.out.println("dec_input: " + dec_input);
        System.out.println();

        System.out.println("dec_to_hex: " + calc.dec_to_hex(dec_input));
        System.out.println("dec_to_binary: " + calc.dec_to_binary(dec_input));
        System.out.println();

        String hex_input = "A93C";

        System.out.println("hex_input: " + hex_input);
        System.out.println();

        System.out.println("hex_to_dec: " + calc.hex_to_dec(hex_input));
        System.out.println("hex_to_binary: " + calc.hex_to_binary(hex_input));




    }
}

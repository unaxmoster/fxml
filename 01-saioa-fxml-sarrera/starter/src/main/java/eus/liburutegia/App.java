
package eus.liburutegia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // FXML fitxategia kargatu
        FXMLLoader loader = new FXMLLoader(
                App.class.getResource("/eus/liburutegia/liburu-form.fxml")
        );

        Parent root = loader.load();

        // Leihoa sortu
        stage.setTitle("Liburutegia");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


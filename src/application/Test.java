package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Test extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("damso.fxml"));
			Scene scene = new Scene(root);
			Image image = new Image("/icons/maes.png");
			primaryStage.getIcons().add(image);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Accueil.Daeels");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

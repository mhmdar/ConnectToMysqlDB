package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	public static Scene scene;
	public static Parent root;
	Stage stage;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
			scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			stage = primaryStage;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	public static void adminPage(){
//		try {
//			root = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
//			scene = new Scene(root);
////			stage.setScene(scene);
////			stage.show();
//			
////			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}

package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminPage implements Initializable {
	
	private static Button b;
	
	@FXML
	private static AnchorPane xmlns;
	
	@FXML
	private static ComboBox<String> combo1, combo2;
	
	@FXML
	private static Button searchButton;
	
	public static void adminPage(){
		try {
			
			Parent adminPane = FXMLLoader.load(AdminPage.class.getResource("adminPage.fxml"));
			Scene scene = new Scene(adminPane);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage adminStage = new Stage();
			adminStage.setScene(scene);
			adminStage.show();

			b.setLayoutX(200);
			b.setLayoutY(200);
			
			b.setText("hiiiiii");
			xmlns.getChildren().add(b);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<String> list = new ArrayList<String>();
        list.add("Item A");
        list.add("Item B");
        list.add("Item C");
        ObservableList obList = FXCollections.observableList(list);
        combo1.getItems().clear();
        combo1.setItems(obList);
        combo1.getItems().setAll("Apple", "Orange", "Pear");
	}
}

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Button loginButton;
	
	@FXML
	private Button clickme;
	
	@FXML
	private Pane pane;
	
	
	
	public void authenticator(ActionEvent event){
		System.out.println(username.getText().toString()+"  "+password.getText().toString());
		if(username.getText().equals("admin") && password.getText().equals("")){
			System.out.println("authenticated");
			// Hide the Login window:
			pane.getScene().getWindow().hide();
//			Stage stage =(Stage)(event.getSource()); 
////			stage.close();
			AdminPage.adminPage();
		}
	}
	
	public void loginButtonAcceptEnter(KeyEvent event){
		if (event.getCode() == KeyCode.ENTER)
			loginButton.fire();
	}
}

package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameOverController {
	public void buttonClick(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/MainMenu.fxml"));
		Scene gameover=new Scene(root,600,400);
		Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
		window.setScene(gameover);
		window.show();
	}
}

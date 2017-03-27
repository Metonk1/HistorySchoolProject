package practiceGUI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class FindTextBookPage {
	private Label findByIsbnLbl;
	private TextField findByIsbnField;
	private HBox findTextBox;
	private Button findTextBtn;
	
	public FindTextBookPage(){
		
		findByIsbnLbl = new Label("Isbn: ");
		findByIsbnField = new TextField();
		findTextBtn = new Button("Find TextBook");
		findTextBox = new HBox(15);
		findTextBox.getChildren().addAll(findByIsbnLbl, findByIsbnField, findTextBtn);
		
	}
	
	public String getFindIsbn(){
		return findByIsbnField.getText();
	}
	
	public HBox getFindTextBox(){
		return findTextBox;
	}
	
	public Button getFindTextBtn(){
		return findTextBtn;
	}
	
	public TextField getFindByIsbnField(){
		return findByIsbnField;
	}
}



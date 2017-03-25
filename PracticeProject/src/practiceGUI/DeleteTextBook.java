package practiceGUI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class DeleteTextBook {

	private Label deleteByIsbnLbl;
	private TextField deleteByIsbnField;
	private HBox deleteTextBox;
	private Button deleteTextBtn;
	
	public DeleteTextBook(){
		
		deleteByIsbnLbl = new Label("Isbn: ");
		deleteByIsbnField = new TextField();
		deleteTextBtn = new Button("Delete TextBook");
		deleteTextBox = new HBox(15);
		deleteTextBox.getChildren().addAll(deleteByIsbnLbl, deleteByIsbnField, deleteTextBtn);
		
	}
	
	public String getDeleteIsbn(){
		return deleteByIsbnField.getText();
	}
	
	public HBox getDeleteTextBox(){
		return deleteTextBox;
	}
	
	public Button getDeleteTextButton(){
		return deleteTextBtn;
	}
	
	public TextField getDeleteByIsbnField(){
		return deleteByIsbnField;
	}
}


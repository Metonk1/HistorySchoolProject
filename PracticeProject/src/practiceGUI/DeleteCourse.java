package practiceGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class DeleteCourse {
	private Label deleteLbl;
	private TextField deleteField;
	private Button deleteBtn;
	private HBox deleteBox;
	private Scene deleteScene;
	
	public DeleteCourse(){
		
		deleteLbl = new Label("Curse Number: ");
		deleteField = new TextField();
		deleteBtn = new Button("Delete Course");
		deleteBox = new HBox(10);
		deleteBox.getChildren().addAll(deleteLbl, deleteField, deleteBtn);
		deleteScene = new Scene(deleteBox);
		
	
	}
	
	public Scene getDeleteCourseScene(){
		return deleteScene;
	}
	public HBox getDeleteBox(){
		return deleteBox;
	}
	
	public Button getDeleteBtn(){
		return deleteBtn;
	}
	
	public String getCourseNumber(){
		return deleteField.getText();
	}
	
	public TextField getDeleteField(){
		return deleteField;
	}
}
	
	
	

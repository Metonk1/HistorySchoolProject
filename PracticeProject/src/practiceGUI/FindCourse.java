package practiceGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class FindCourse {
	private Label findLbl;
	private TextField findField;
	private Button findBtn;
	Scene findScene;
	HBox findBox;
	
	public FindCourse(){
		findLbl = new Label("Enter Course Number");
		findField = new TextField();
		findBtn = new Button("Find Course");
		findBox = new HBox(10);
		findBox.getChildren().addAll(findLbl, findField, findBtn);
		findScene = new Scene(findBox);
	}
	
	public Scene getFindScene(){
		return findScene;
	}
	
	public HBox getFindBox(){
		return findBox;
	}
	
	public TextField getFindCourseField(){
		return findField;
	}
	
	public String getCourseNumber(){
		return findField.getText();
	}
	
	public Button getFindButton(){
		return findBtn;
	}
}

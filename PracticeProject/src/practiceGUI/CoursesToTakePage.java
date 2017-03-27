//Need to change into CoursesToTake

package practiceGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CoursesToTakePage {
	
	private Label coursesToTakeLbl;
	private TextField coursesToTakeField;
	private Button enterBtn;
	private HBox coursesToTakeBox;
	private Scene coursesToTakeScene;
	private Scene courseToTakeSceneII;
	private VBox courseToTakeVbox;
	private Button nextBtn;
	
	public CoursesToTakePage(){
		coursesToTakeLbl = new Label("Enter How Many Courses do you need to take before you graduate: ");
		coursesToTakeField = new TextField();
		enterBtn = new Button("Enter");
	
		nextBtn = new Button("Next");
		coursesToTakeBox = new HBox(10);
		coursesToTakeBox.getChildren().addAll(coursesToTakeLbl, coursesToTakeField, enterBtn);
		courseToTakeVbox = new VBox(10);
		Label enterLbl = new Label("Enter Courses Taking Below");
		courseToTakeVbox.getChildren().addAll(enterLbl);
		
		coursesToTakeScene = new Scene(coursesToTakeBox,600,600);
		courseToTakeSceneII = new Scene(courseToTakeVbox,600,600);
	}
	
	public void setVBoxCoursesTaking(int amount){
		TextField[] coursesToTake = new TextField[amount];
		for(int i = 1; i <= amount; i++){
			TextField tf = new TextField();
			courseToTakeVbox.getChildren().add(tf);
			coursesToTake[i - 1] = tf;
		}
		courseToTakeVbox.getChildren().addAll(nextBtn);
	}
	
	public String getAmountCoursesToTake(){
		return coursesToTakeField.getText();
	}
	
	public Button getEnterBtn(){
		return enterBtn;
	}
	public Scene getCoursesToTake(){
		return coursesToTakeScene;
	}
	
	public Scene getCoursesToTakeSceneII(){
		return courseToTakeSceneII;
	}
	
	public Button getNextBtn(){
		return nextBtn;
	}
}

//Will be Guinea pig
//Idea similar to like  bag class to get the courses.

//Idea 1 - Setter for setScene, which takes in an int as its Parameter. OR a vbox

//Idea 2 - get rid of the HBox and replace it with VBOx
// Split it into two scenes One for that and another for the other
package practiceGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CoursesTakingPage {
	
	private Label coursesTakingLbl;
	private TextField coursesTakingField;
	private Button enterBtn;
	private HBox coursesTakingBox;
	private Scene coursesTakingScene;
	private Scene courseTakingSceneII;
	private VBox courseTakingVbox;
	private Button nextBtn;
	
	private TextField[] coursesCurrentlyTaking;
	
	public CoursesTakingPage(){
		coursesTakingLbl = new Label("Enter How Many Courses You Are Currently Taking: ");
		coursesTakingField = new TextField();
		enterBtn = new Button("Enter");
		nextBtn = new Button("Next");
		coursesTakingBox = new HBox(10);
		coursesTakingBox.getChildren().addAll(coursesTakingLbl, coursesTakingField, enterBtn);
		courseTakingVbox = new VBox(10);
		Label enterLbl = new Label("Enter Courses Taking Below");
		courseTakingVbox.getChildren().addAll(enterLbl);
		
		coursesTakingScene = new Scene(coursesTakingBox,600,600);
		courseTakingSceneII = new Scene(courseTakingVbox,600,600);
	}
	
	public void setVBoxCoursesTaking(int amount){
		//TextField[] coursesCurrentlyTaking = new TextField[amount];
		coursesCurrentlyTaking = new TextField[amount];
		for(int i = 1; i <= amount; i++){
			TextField tf = new TextField();
			courseTakingVbox.getChildren().add(tf);
			coursesCurrentlyTaking[i - 1] = tf;
		}
		courseTakingVbox.getChildren().addAll(nextBtn);
	}
	
	//Idea IDEA RETURN TEXTFIELD INSIDE - or ARRAY TEXTFIELD
	/*public TextField getCourseTakingField(){
		int amount = Integer.parseInt(getAmountCoursesTaking());
		for(int i = 0; i < amount; i++){
			return coursesCurrentlyTaking[i];
		}
		return coursesTakingField;
	}
	*/
	
	public TextField[] getCoursesTakingField(){
		return coursesCurrentlyTaking;
	}
	public String getAmountCoursesTaking(){
		return coursesTakingField.getText();
	}
	
	public Button getEnterBtn(){
		return enterBtn;
	}
	public Scene getCoursesTakingScene(){
		return coursesTakingScene;
	}
	
	public Scene getCoursesTakingSceneII(){
		return courseTakingSceneII;
	}
	
	
	public Button getNextBtn(){
		return nextBtn;
	}

}

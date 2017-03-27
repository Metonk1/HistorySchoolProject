//Need to change into Courses Took

//Since this is last, we need a finishbtn not next
package practiceGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CoursesTookPage {

	private Label coursesTookLbl;
	private TextField coursesTookField;
	private Button enterBtn;
	private HBox coursesTookBox;
	private Scene coursesTookScene;
	private Scene coursesTookSceneII;
	private VBox coursesTookVbox;
	private Button finishBtn;

	private TextField[] coursesTook;
	
	public CoursesTookPage() {
		
		coursesTookLbl = new Label("Enter How Many Courses have you took: ");
		coursesTookField = new TextField();
		enterBtn = new Button("Enter");
		finishBtn = new Button("Create Student");
		coursesTookBox = new HBox(10);
		coursesTookBox.getChildren().addAll(coursesTookLbl, coursesTookField, enterBtn);
		coursesTookVbox = new VBox(10);
		Label enterLbl = new Label("Enter Courses Took Below");
		coursesTookVbox.getChildren().addAll(enterLbl);

		coursesTookScene = new Scene(coursesTookBox, 600, 600);
		coursesTookSceneII = new Scene(coursesTookVbox, 600, 600);
	}

	public void setVBoxCoursesTook(int amount) {
		TextField[] coursesTook = new TextField[amount];
		for (int i = 1; i <= amount; i++) {
			TextField tf = new TextField();
			coursesTookVbox.getChildren().add(tf);
			coursesTook[i - 1] = tf;
		}
		coursesTookVbox.getChildren().addAll(finishBtn);
	}

	public String getAmountCoursesTook() {
		return coursesTookField.getText();
	}

	public Button getEnterBtn() {
		return enterBtn;
	}

	public Scene getCoursesTookScene() {
		return coursesTookScene;
	}

	public Scene getCoursesTookSceneII() {
		return coursesTookSceneII;
	}

	public Button getFinishBtn(){
		return finishBtn;
	}
	
	//Another getter - for the SBag, studentpage automatically creates it per. Store into array or sometihng another possible
	
/*	public String getCoursesTook(){
		int amount = Integer.parseInt(getAmountCoursesTook());
		for(int x = 0; x < amount ; x++){
			return coursesTook[x].getText();
		}
		return null;
	}*/
}

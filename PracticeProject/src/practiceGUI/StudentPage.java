package practiceGUI; //will extend personpage - for courses, will divide them up in classes and make them scens with next button and last one being finish, with back

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class StudentPage extends PersonPage {
	
	//PersonPage pPage = new PersonPage();
	private Button nextBtn;
	private VBox studentBox;
	
	public StudentPage(){
		nextBtn = new Button("Next");
		studentBox = new VBox(10);
		//studentBox.getChildren().addAll(pPage.getPersonBox(), nextBtn);
		studentBox.getChildren().addAll(getPersonBox(), nextBtn);
	}
	
	public Button getNextBtn(){
		return nextBtn;
	}
	
	public VBox getStudentBox(){
		return studentBox;
	}
}

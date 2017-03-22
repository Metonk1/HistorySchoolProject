package practiceGUI;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BodyBagPage {
	private Button addStudentBtn;
	private Button addFacultyBtn;
	private Button findPersonBtn;
	private Button deletePersonBtn;
	private Button displayPersonBtn;
	private Button saveBodyBagBtn;
	private Button loadBodyBagBtn;
	
	private HBox bodyBtnBox;
	
	public BodyBagPage(){
		addStudentBtn = new Button("Add Student");
		addFacultyBtn = new Button("Add Faculty");
		findPersonBtn = new Button("Find Person");
		deletePersonBtn = new Button("Delete Person");
		displayPersonBtn = new Button("Display Person");
		loadBodyBagBtn = new Button("Load Student/Faculty");
		saveBodyBagBtn = new Button("Save Student/Faculty");
		bodyBtnBox = new HBox(10);
		bodyBtnBox.getChildren().addAll(addStudentBtn, addFacultyBtn, findPersonBtn, deletePersonBtn, displayPersonBtn, loadBodyBagBtn, saveBodyBagBtn);
	}
	
	public Button getAddStudentBtn(){
		return addStudentBtn;
	}
	
	public Button getAddFacultyBtn(){
		return addFacultyBtn;
	}


	public Button getfindPersonBtn(){
		return findPersonBtn;
	}

	public Button getdeletePersonBtn(){
		return deletePersonBtn;
	}

	public Button getdisplayPersonBtn(){
		return displayPersonBtn;
	}

	public Button getloadBodyBagBtn(){
		return loadBodyBagBtn;
	}

	public Button getsaveBodyBagBtn(){
		return saveBodyBagBtn;
	}

	public HBox getbodyBtnBox(){
		return bodyBtnBox;
		
	}

	

}

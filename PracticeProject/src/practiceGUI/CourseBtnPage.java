package practiceGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class CourseBtnPage {

	private Button addBtn, displayBtn, findBtn, deleteBtn, saveBtn, loadBtn;
	private HBox btnBox;
	private Scene scene;

	public CourseBtnPage() {
		addBtn = new Button("Add Course");
		displayBtn = new Button("Display Course");
		findBtn = new Button("Find Course");
		deleteBtn = new Button("Remove Course");
		saveBtn = new Button("Save Courses");
		loadBtn = new Button("Load Courses");
		btnBox = new HBox(10);
		btnBox.getChildren().addAll(addBtn, displayBtn, findBtn, deleteBtn, saveBtn, loadBtn);

		scene = new Scene(btnBox);
	}

	public HBox getBtnBox() {
		return btnBox;
	}

	public Scene getCourseBtnScene() {
		return scene;
	}

	public Button getAddBtn() {
		return addBtn;
	}

	public Button getDisplayBtn() {
			return displayBtn;
	}

	public Button getDeleteBtn() {
		return deleteBtn;
	}

	public Button getFindBtn() {
		return findBtn;
	}
	
	public Button getSaveBtn(){
		return saveBtn;
	}
	
	public Button getLoadBtn(){
		return loadBtn;
	}
}

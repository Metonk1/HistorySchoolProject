package practiceGUI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FacultyPage extends PersonPage {
	
	// pPage = new PersonPage();
	private Label officeNumberLbl;
	private Label salaryLbl;
	private TextField officeNumberField;
	private TextField salaryField;
	private HBox officeBox;
	private HBox salaryBox;
	private VBox facultyBox;
	private Button createFacultyBtn;

	public FacultyPage(){
		officeNumberLbl = new Label("Office Number:");
		salaryLbl = new Label("Salary: ");
		officeNumberField = new TextField();
		salaryField = new TextField();
		
		officeBox = new HBox(10);
		officeBox.getChildren().addAll(officeNumberLbl, officeNumberField);
		
		salaryBox = new HBox(10);
		salaryBox.getChildren().addAll(salaryLbl, salaryField);
		
		createFacultyBtn = new Button("Create Faculty");
		
		facultyBox = new VBox(10);
		facultyBox.getChildren().addAll(getPersonBox(), officeBox, salaryBox, createFacultyBtn);
	}
	
	public VBox getFacultyBox(){
		return facultyBox;
	}
	
	public Button getCreateFacultyBtn(){
		return createFacultyBtn;
	}
	
	public String getOfficeNumber(){
		return officeNumberField.getText();
	}
	public String getSalary(){
		return salaryField.getText();
	}
	
	public TextField getSalaryField(){
		return salaryField;
	}
	public TextField getOfficeNumberField(){
		return officeNumberField;
	}
}

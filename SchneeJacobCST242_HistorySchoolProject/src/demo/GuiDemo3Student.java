/*
 * New Ideas here, we're going to try something with combo boxes and course ids.
 */
package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Address;
import model.BodyBag;
import model.Course;
import model.MasterCourseBag;
import model.Student;
import model.courseBag;

public class GuiDemo3Student extends Application {

	public static void main(String[] args) {
		launch(args);		
	}

	@Override
	public void start(Stage stage) throws Exception {
			BodyBag pBag = new BodyBag();
			courseBag studentBag = new courseBag();
			MasterCourseBag mcb = new MasterCourseBag();
			mcb.loadCourse();
			mcb.displayCourse();
			
			Label fNameLbl = new Label("First Name");
			TextField fNameField = new TextField();
			Label lNameLbl = new Label("First Name");
			TextField lNameField = new TextField();
			HBox nameBox = new HBox(10);
			nameBox.getChildren().addAll(fNameLbl, fNameField, lNameLbl, lNameField);
			
			//Address
			Label stNumbLbl = new Label("Street Number");
			TextField stNumbField = new TextField();
			Label stNameLbl = new Label("Street Name");
			TextField stNameField = new TextField();
			HBox addpartBox = new HBox(10);
			addpartBox.getChildren().addAll();
			Label townLbl = new Label("Town/City");
			TextField townField = new TextField();
			Label zipLbl = new Label("Zip");
			TextField zipField = new TextField();
			ComboBox <String> state = new ComboBox<String>();
			//final ComboBox state = new ComboBox();
			state.getItems().addAll("Alabama" , "Alaska" ,"Arizona" ,"Arkansas" ,"California" ,"Colorado" ,"Connecticut" ,"Delaware", "Florida" ,"Georgia","Hawaii" ,"Idaho" ,"Illinois" , "Indiana" ,"Iowa" ,"Kansas" ,"Kentucky" ,"Louisiana" ,"Maine" 
					,"Maryland" ,"Massachusetts" ,"Michigan" ,"Minnesota" ,"Mississippi" ,"Missouri" ,"Montana" ,"Nebraska" ,"Nevada" 
					,"New Hampshire" ,"New Jersey" ,"New Mexico" ,"New York","North Carolina" ,"North Dakota" 
					,"Ohio" ,"Oklahoma" ,"Oregon" ,"Pennsylvania" ,"Rhode Island" ,"South Carolina" ,"South Dakota" ,"Tennessee" 
					,"Texas" ,"Utah" ,"Vermont" ,"Virginia" ,"Washington" ,"West Virginia" ,"Wisconsin" ,"Wyoming");
		
			
			HBox otherpartBox = new HBox(10);
			otherpartBox.getChildren().addAll(stNumbLbl, stNumbField, stNameLbl, stNameField, townLbl, townField, zipLbl, zipField, state);
			VBox addressBox = new VBox(10);
			addressBox.getChildren().addAll(nameBox,otherpartBox);
			
			//Button Box to Add - Display , as well save and load
			Button addBtn = new Button("Add Student");
			Button displayBtn = new Button("Display");
			Button saveBtn = new Button("Save");
			Button loadBtn = new Button("Load");
			HBox buttonBox = new HBox(10);
			buttonBox.getChildren().addAll(addBtn, displayBtn, saveBtn, loadBtn);
			//Find Student
			Label findLbl= new Label("Id");
			TextField findField = new TextField();
			Button findBtn = new Button("Find");
			HBox findBox = new HBox(10);
			findBox.getChildren().addAll(findLbl, findField, findBtn);
			//Delete Student
			Label deleteLbl = new Label("Id");
			TextField deleteField = new TextField();
			Button deleteBtn = new Button("Delete");
			HBox deleteBox = new HBox(10);
			deleteBox.getChildren().addAll(deleteLbl, deleteField, deleteBtn);
			
			//Just do one course per thing, i have an idea. Combo box idea
			ComboBox <Course> coursesBox = new ComboBox<Course>();
			coursesBox.setValue(mcb.getCourseList().get(0));
			
			addBtn.setOnAction(e -> { 
				String fName = fNameField.getText();
				String lName = lNameField.getText();
				
				String stNumb = stNumbField.getText();
				String stName = stNameField.getText();
				String town = townField.getText();
				String zip = zipField.getText();
				String theState = state.getValue();
				Address a = new Address(stNumb, stName, town, theState, zip);
				
				Student s = new Student(fName, lName, a, studentBag);
				pBag.addPerson(s);
				studentBag.addCoursesTaking(coursesBox.getValue());
				
				fNameField.clear();
				lNameField.clear();
				stNumbField.clear();
				stNameField.clear();
				townField.clear();
				zipField.clear();
				state.setValue("");
				
			});
			
			displayBtn.setOnAction(e -> { 
				pBag.displayBodyBag();
			});
			
			deleteBtn.setOnAction(e -> { 
				String id = deleteField.getText();
				pBag.deletePerson(id);
			});
			
			//Find should also re-pop, you know edit purposes
			findBtn.setOnAction(e -> { 
				String id = findField.getText();
				System.out.println(pBag.findByID(id));
			});
			
			saveBtn.setOnAction(e -> {
				pBag.save();
			});
			
			loadBtn.setOnAction(e -> {
				pBag.load();
			});
			
			//We need to also look into the courses as well.
			VBox everythingBox = new VBox();
			everythingBox.getChildren().addAll(nameBox, addressBox, buttonBox, findBox, deleteBox, coursesBox);
			Scene scene = new Scene (everythingBox);
			stage.setScene(scene);
			stage.show();
		
	}

}

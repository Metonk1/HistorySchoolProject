//This is practice with exception handling

//Worry about the Layout later, the primary objective is to make it work and utilize exception handling.

//3-11 update: Everything works, now alls that left is exception handling. What needs to be checked:
/* Adding
 * Course Number - Needs to be a number, and may be a limit. (5 digits?) - gotta check that
 * Credits - Needs to be a number as well, no letters.
 * Course Name - Needs to be letters and could have numbers. Is it possible to have a check for the first name, because 
 * 	courses start like AST101, So may be check if it starts with a letter.
 * 
 * SubRoutines:
 * 	A. Delete - No Letters, needs to be Numbers
 * 	B  Find	- 	Same things no Letters, just numbers
 * 	
*/
package demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import model.Course;
import model.MasterCourseBag;

public class GuiDemo1courses extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Course needs MCB, needs course Number, name and amount of credits.
		// We'll also be utilizing master course bag as well.
		MasterCourseBag mcb = new MasterCourseBag();
		Label courseNumberLbl = new Label("Course Number: ");
		TextField courseNumberField = new TextField();
		Label courseNameLbl = new Label("Course Name: ");
		TextField courseNameField = new TextField();
		Label creditsLbl = new Label("Credits: ");
		TextField creditsField = new TextField();
		
		Button saveBtn = new Button("Save Courses");
		Button loadBtn = new Button("Load Courses");

		Button addBtn = new Button("Add Course");
		Button displayBtn = new Button("Display");
		Button findBtn = new Button("Find Course");
		Button deleteBtn = new Button("Delete Course");
		
		Label deleteLbl = new Label("Course Number:");
		TextField deleteField = new TextField();
		HBox deleteBox = new HBox(15);
		deleteBox.getChildren().addAll(deleteLbl, deleteField, deleteBtn);
		deleteBox.setAlignment(Pos.CENTER);
		
		Label findLbl = new Label("Course Number");
		TextField findField = new TextField();
		HBox findBox = new HBox(15);
		findBox.getChildren().addAll(findLbl, findField, findBtn);
		findBox.setAlignment(Pos.CENTER);
		
		//HBox buttonBox = new HBox(10);
		//buttonBox.getChildren().setAll(addBtn, displayBtn);
		//buttonBox.setAlignment(Pos.CENTER);
		// gridpane
		GridPane root = new GridPane();
		root.setHgap(5);
		root.setVgap(5);
		 root.setPadding(new Insets(0, 10, 0, 10)); 
		//------------------------------------------------------------------------------------------------
		//THIS I NEED TO PLAY AROUND WITH - yea one column at a time, see the changes and make notes
		/*ColumnConstraints cons1 = new ColumnConstraints();
		cons1.setHgrow(Priority.NEVER);	//Previous Never
		root.getColumnConstraints().add(cons1);
		cons1.setPercentWidth(10);
		ColumnConstraints cons2 = new ColumnConstraints(); // Add a # in par.
		cons2.setHgrow(Priority.NEVER); 	//Previous Never
		cons2.setPercentWidth(15);*/

		/*root.getColumnConstraints().addAll(cons1, cons2);

		RowConstraints rcons1 = new RowConstraints();
		rcons1.setVgrow(Priority.NEVER); 	//Previous Never

		RowConstraints rcons2 = new RowConstraints();
		rcons2.setVgrow(Priority.NEVER);	//Previous Never

		root.getRowConstraints().addAll(rcons1, rcons2);*/
		//-----------------------------------------------------------------------------------------------------

		root.add(courseNumberLbl, 0, 0);
		root.add(courseNumberField, 1, 0);
		root.add(courseNameLbl, 0, 1);
		root.add(courseNameField, 1, 1);
		root.add(creditsLbl, 0, 2);
		root.add(creditsField, 1, 2);
		root.add(addBtn, 2, 2);	//Column, Row	usually its RC = row by column rxc
		root.add(displayBtn, 0, 3);
		//root.add(child, columnIndex, rowIndex);
		root.add(deleteBox, 0, 4);
		root.add(findBox, 0, 5);
		root.add(loadBtn, 1, 6);
		root.add(saveBtn, 2, 6);
		
		root.setAlignment(Pos.CENTER);
		
		
		//Button action here. 
		addBtn.setOnAction(e -> {
			String courseNumber = courseNumberField.getText();
			String courseName = courseNameField.getText();
			String credits = creditsField.getText();
			int credit = Integer.parseInt(credits);
			Course c = new Course(courseNumber, courseName, credit);
			mcb.addCourse(c);
			courseNumberField.clear();
			courseNameField.clear();
			creditsField.clear();
		});
		
		displayBtn.setOnAction(e -> {
			mcb.displayCourse();
		});
		
		deleteBtn.setOnAction(e -> { 
			String id = deleteField.getText();
			mcb.deleteCourse(id);
			deleteField.clear();
		});
		
		findBtn.setOnAction(e -> { 
			String id = findField.getText();
			System.out.println(mcb.findCourse(id));
			findField.clear();
		});
		
		saveBtn.setOnAction(e -> { 
			mcb.saveCourse();
		});
		
		loadBtn.setOnAction(e -> { 
			mcb.loadCourse();
		});


		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}
}

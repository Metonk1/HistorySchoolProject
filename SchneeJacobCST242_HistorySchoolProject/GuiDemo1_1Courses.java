

// * This is practice with exception handling
 //*/

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

/*
 * 3-13 and 3-14 Exception Handling/Custom EXception handling
 */

package viewdemo; 

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import model.Course;
import model.CreditsException;
import model.MasterCourseBag;

public class GuiDemo1_1Courses extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		/*Stage stage2 = new Stage();
		Label cLabel = new Label("Credit: ");
		ComboBox <String> cBox = new ComboBox<String>();
		//final ComboBox state = new ComboBox();
		cBox.getItems().addAll("1","2","3","4");
		Button cButton = new Button("Add");
		HBox aBox = new HBox(10);
		aBox.getChildren().addAll(cLabel, cBox, cButton);
		Scene cScene = new Scene(aBox);*/
		
		// Course needs MCB, needs course Number, name and amount of credits.
		// We'll also be utilizing master course bag as well.
		MasterCourseBag mcb = new MasterCourseBag();
		Label courseNumberLbl = new Label("Course Number: ");
		TextField courseNumberField = new TextField();
		Label courseNameLbl = new Label("Course Name: ");
		TextField courseNameField = new TextField();
		//ComboBox <Integer> creditBox = new ComboBox<Integer>();
		//final ComboBox state = new ComboBox();
		//creditBox.getItems().addAll(1,2,3,4);
		ComboBox <String> creditBox = new ComboBox<String>();
		creditBox.getItems().addAll("1","2","3","4");
		Label creditsLbl = new Label("Credits: ");
		//TextField creditsField = new TextField();
		
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
		root.add(creditBox, 1, 2);
		//root.add(creditsField, 1, 2);
		root.add(addBtn, 2, 2);	//Column, Row	usually its RC = row by column rxc
		root.add(displayBtn, 0, 3);
		//root.add(child, columnIndex, rowIndex);
		root.add(deleteBox, 0, 4);
		root.add(findBox, 0, 5);
		root.add(loadBtn, 1, 6);
		root.add(saveBtn, 2, 6);
		
		root.setAlignment(Pos.CENTER);
		
		//Button action here.
		
		//3-15 = Try surronding it with try inside
		addBtn.setOnAction(e -> {
		//Check here i guess
			
			//ON HOLD TILL WE FIGURE OUT
			/*int credit;
			if(creditBox.getValue() == null){
				try {
					throw new NullPointerException("Error");
				} catch (Exception e1) {
					System.out.println("error");
					//e1.getMessage();
					//e1.printStackTrace();
					
					//We created a window that displayed a new combobox, with it. or An ale
					credit = creditBox.getValue();
					//e1.getMessage();
				}
			}else{
				credit = creditBox.getValue();

			}*/
			//String courseNumber = courseNumberField.getText();
			//String courseName = courseNameField.getText();
		
			//String credits = creditsField.getText();
		//Why dont we do a combo Box, for credits.	
		/*	for(int i = 0; i < credits.length();i++){
			if(Character.isLetter(credits.charAt(i))){
				//creditsField.setText("Error Wrong Input");
				try {
					//throw new NumberFormatException();
					throw new CreditsException("Error there can only be digits in the credits Field.");
				} catch (CreditsException e1) {
					//e1.getMessage();
					creditsField.clear();
					System.out.println("Error!!!!");
					//e1.getMessage();
				}
				}else{
					credit = Integer.parseInt(credits);
			}
			}*/
			
			//Switch it to a string
		/*	int credit;
		try{
			 credit = creditBox.getValue();
					throw new NullPointerException();
				}
				
			catch(NullPointerException a){
				System.out.println("Error you didn't select a credit number.");
				
				stage2.setScene(cScene);
				stage2.show();
				
				cBox.setOnAction(d -> {
				int	acredit = cBox.getValue();
				System.out.println
				});
				
			
			}*/
			
/*try{
			String credit = creditBox.getValue();
			
			 creds = Integer.parseInt(credit);
}catch(NumberFormatException a){			
	System.out.println("ERROR!");
	
	
}*/	
			//It kind of works but needs work on it
			//Surround it with try and catch to catch the various errors. 
			try{
				
			
			String courseNumber = courseNumberField.getText();
			String courseName = courseNameField.getText();
			String credit = creditBox.getValue();
			int creds = Integer.parseInt(credit);
		Course c = new Course(courseNumber, courseName, creds);
		if(courseNumber.equals("") || courseName.equals("")){
			throw new NullPointerException();
		}
		mcb.addCourse(c);
			}catch(NumberFormatException a){
				//Doesn't create the course, please re-enter 
				System.out.println("Error Cannot do that");
			}catch(NullPointerException b){
				System.out.println("Error redo it");
				System.out.println("original input: courseNumber: " +courseNumberField.getText() 
				+ "\ncourseName: " + courseNameField.getText());
			}
			//Course c = new Course(courseNumber, courseName, credit);

			//Another problem is the duplication
			courseNumberField.clear();
			courseNameField.clear();
			//creditsField.clear();
			creditBox.setValue("");
			//creditBox.setValue(0);
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

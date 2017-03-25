//Were here to try methods, for example scene created here

//Well experiment with containers. So lets do HBox for now then switch over to GridPane

//3-23: Were going to just have the user add the ISBN of the Textbook.
package practiceGUI;

import data.Course;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CoursePage {

		private Label courseNameLbl, courseNumberLbl, creditsLbl, textBookLbl;
		private TextField courseNameField, courseNumberField, creditsField, textBookField;
		private Button addBtn;
		//HBox
		private HBox courseNumberBox;
		private HBox courseNameBox;
		private HBox creditBox;
		private HBox textBookBox;
		//VBox
		private VBox courseVbox;

		private Scene courseScene;
		//Declare everything inside
		public CoursePage() {
			super();
			addBtn = new Button("Add Course to Bag");
			courseNameLbl = new Label("Course Name: ");
			courseNumberLbl = new Label("Course Number: ");
			creditsLbl = new Label("Credits: ");
			courseNameField = new TextField();
			courseNumberField = new TextField();
			creditsField = new TextField();
			addBtn = new Button("Add");

			//TextBook class section
			textBookLbl = new Label("TextBook Isbn: ");
			textBookField = new TextField();
			textBookBox = new HBox(10);
			textBookBox.getChildren().addAll(textBookLbl, textBookField);

			courseNumberBox = new HBox(10);
			courseNameBox = new HBox(10);
			creditBox = new HBox(10);
			courseNumberBox.getChildren().addAll(courseNumberLbl, courseNumberField);
			courseNameBox.getChildren().addAll(courseNameLbl, courseNameField);
			creditBox.getChildren().addAll(creditsLbl, creditsField);
			courseVbox = new VBox(10);
			courseVbox.getChildren().addAll(courseNumberBox, courseNameBox, creditBox, textBookBox, addBtn);

			courseScene = new Scene(courseVbox);
		}

		public VBox getCourseVBox(){
			return courseVbox;
		}

		public Scene getCourseScene(){
			return courseScene;
		}


		public TextField getCourseNameField(){
			return courseNameField;
		}
		public TextField getCourseNumberField(){
			return courseNumberField;
		}
		public TextField getCreditField(){
			return creditsField;
		}


		//Getter
		public String getCourseName(){
			return courseNameField.getText();
		}

		public String getCourseNumber(){
			return courseNumberField.getText();
		}

		public String getCredits(){
			return creditsField.getText();
		}


		//Textbook getters
		public String getIsbn(){
			return textBookField.getText();
		}

		public TextField getTextBookField(){
			return textBookField;
		}


		//For now getbutton
		public Button getAddBtn(){
			return addBtn;
		}

	/*	public EventHandler<?> btn(){
			addBtn.setOnAction(e -> {
				System.out.println(courseNumberField.getText());
				System.out.println(courseNameField.getText());
				System.out.println(creditsField.getText());

				int credits = Integer.parseInt(creditsField.getText());
				Course c = new Course(courseNumberField.getText(), courseNameField.getText(), credits);
				System.out.print(c);

			});
			return null;

		}*/

}

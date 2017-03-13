package demo;

/*
 * So lets work on the outputs and make sure it doesn't state null, but cannot be found
 * We should also add the address for each
 * Exception handling includes: Name, salary, address, office, find, delete need to be numbers 
 * 
 */




import javafx.application.Application;
import javafx.geometry.Pos;
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
import model.Faculty;

public class GuiDemo2Faculty extends Application {

	public void start(Stage stage) throws Exception {
		//Address a = new Address("2", "Cabernet Ct.", "Coram", "NY", "11727");
		BodyBag bag = new BodyBag();
		Button addBtn = new Button("Add Faculty");

		
		Label fNameLbl = new Label("First Name: ");
		TextField fNameField = new TextField();
		Label lNameLbl = new Label("Last Name: ");
		TextField lNameField = new TextField();
		HBox nameBox = new HBox(10);
		nameBox.getChildren().addAll(fNameLbl, fNameField, lNameLbl, lNameField);
		nameBox.setAlignment(Pos.CENTER);

		Label officeLbl = new Label("Office Number: ");
		TextField officeField = new TextField();
		Label payLbl = new Label("Salary:");
		TextField payField = new TextField();
		HBox facultyBox = new HBox(10);
		facultyBox.getChildren().addAll(payLbl, payField, officeLbl, officeField);
		facultyBox.setAlignment(Pos.CENTER);
		
		//Address Here
		Label streetNumberLbl = new Label("Street Number");
		TextField streetNumberField = new TextField();
		Label streetNameLbl = new Label("Street Name");
		TextField streetNameField = new TextField();
		//HBOx here
		HBox streetBox = new HBox(10);
		streetBox.getChildren().addAll(streetNumberLbl, streetNumberField, streetNameLbl, streetNameField);
		streetBox.setAlignment(Pos.CENTER);
		
		Label townLbl = new Label("Town/City");
		TextField townField = new TextField();
		Label zipLbl = new Label("Zip Code: ");
		TextField zipField = new TextField();
		HBox address2Box = new HBox(10);
		address2Box.getChildren().addAll(townLbl, townField, zipLbl, zipField);
		
		//Practice with combo boxes.
		//We need a comboBox with all fifty states.
		ComboBox <String> state = new ComboBox<String>();
		//final ComboBox state = new ComboBox();
		state.getItems().addAll("Alabama" , "Alaska" ,"Arizona" ,"Arkansas" ,"California" ,"Colorado" ,"Connecticut" ,"Delaware", "Florida" ,"Georgia","Hawaii" ,"Idaho" ,"Illinois" , "Indiana" ,"Iowa" ,"Kansas" ,"Kentucky" ,"Louisiana" ,"Maine" 
				,"Maryland" ,"Massachusetts" ,"Michigan" ,"Minnesota" ,"Mississippi" ,"Missouri" ,"Montana" ,"Nebraska" ,"Nevada" 
				,"New Hampshire" ,"New Jersey" ,"New Mexico" ,"New York","North Carolina" ,"North Dakota" 
				,"Ohio" ,"Oklahoma" ,"Oregon" ,"Pennsylvania" ,"Rhode Island" ,"South Carolina" ,"South Dakota" ,"Tennessee" 
				,"Texas" ,"Utah" ,"Vermont" ,"Virginia" ,"Washington" ,"West Virginia" ,"Wisconsin" ,"Wyoming");
		
		
		VBox addressBox = new VBox(10);
		addressBox.getChildren().addAll(streetBox, address2Box, state);

		HBox dataBox = new HBox(10);
		Button loadBtn = new Button("Load");
		Button saveBtn = new Button("Save");
		Button displayBtn = new Button("Display");
		dataBox.getChildren().addAll(addBtn, saveBtn, loadBtn, displayBtn);

		HBox findFacultyBox = new HBox(10);
		Label findByIdLbl = new Label("Id");
		TextField findByIdField = new TextField();
		Button findBtn = new Button("Find Faculty");
		findFacultyBox.getChildren().addAll(findByIdLbl, findByIdField, findBtn);

		HBox deleteFacultyBox = new HBox(10);
		Label deleteByIdLbl = new Label("Id");
		TextField deleteByIdField = new TextField();
		Button deleteBtn = new Button("Delete Faculty");
		deleteFacultyBox.getChildren().addAll(deleteByIdLbl, deleteByIdField, deleteBtn);

		VBox everythingBox = new VBox(10);
		everythingBox.getChildren().addAll(nameBox, facultyBox, addressBox, findFacultyBox, deleteFacultyBox, dataBox);

		// Button Actions
		addBtn.setOnAction(e -> {
			String fName = fNameField.getText();
			String lName = lNameField.getText();
			String office = officeField.getText();
			String pay = payField.getText();
			double salary = Double.parseDouble(pay);
			
			//Address here
			String stNumb = streetNumberField.getText();
			String stName = streetNameField.getText();
			String zip = zipField.getText();
			String tow = townField.getText();
			//String state = state.getValue();
			
			Address a = new Address(stNumb, stName, tow, state.getValue(), zip);
			
			Faculty f = new Faculty(fName, lName, a, office, salary);
			bag.addPerson(f);
			fNameField.clear();
			lNameField.clear();
			payField.clear();
			officeField.clear();
			
			streetNumberField.clear();
			streetNameField.clear();
			zipField.clear();
			townField.clear();
			state.setValue("");
		});

		deleteBtn.setOnAction(e -> {
			String id = deleteByIdField.getText();
			bag.deletePerson(id);
			deleteByIdField.clear();
		});
		//Lets try faculty aswell - later
		findBtn.setOnAction(e -> {
			String id = findByIdField.getText();
			System.out.println(bag.findByID(id));
			findByIdField.clear();
		});
		displayBtn.setOnAction(e -> {
			bag.displayBodyBag();
		});
		loadBtn.setOnAction(e -> {
			bag.load();
		});
		saveBtn.setOnAction(e -> {
			bag.save();
		});

		Scene scene = new Scene(everythingBox);
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}

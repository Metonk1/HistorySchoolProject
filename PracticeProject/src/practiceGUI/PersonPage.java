package practiceGUI;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PersonPage {
	
	private Label fNameLbl, lNameLbl, stNumbLbl, stNameLbl, cityLbl, zipLbl;
	private TextField fNameField, lNameField, stNumbField, stNameField, cityField, zipField;
	private HBox nameBox;
	private VBox personBox;
	private ComboBox<String> stateBox; //This one is going to be challenge.
	private HBox streetBox;
	private HBox cityZipBox;
	private VBox addressBox;
	private Label stateLbl;
	
	public PersonPage(){
		
		fNameLbl = new Label("First Name: ");
		lNameLbl = new Label("Last Name: ");
		stNumbLbl = new Label("Street Number");
		stNameLbl = new Label("Street Name: ");
		cityLbl = new Label("City/Town: ");
		zipLbl = new Label("Zip: ");
		stateLbl = new Label("State");
		
		fNameField = new TextField();
		lNameField = new TextField();
		stNumbField = new TextField();
		stNameField = new TextField();
		cityField = new TextField();
		zipField = new TextField();
		
		stateBox = new ComboBox<String>();
		stateBox.getItems().addAll("Alabama" , "Alaska" ,"Arizona" ,"Arkansas" ,"California" ,"Colorado" ,"Connecticut" ,"Delaware", "Florida" ,"Georgia","Hawaii" ,"Idaho" ,"Illinois" , "Indiana" ,"Iowa" ,"Kansas" ,"Kentucky" ,"Louisiana" ,"Maine" 
				,"Maryland" ,"Massachusetts" ,"Michigan" ,"Minnesota" ,"Mississippi" ,"Missouri" ,"Montana" ,"Nebraska" ,"Nevada" 
				,"New Hampshire" ,"New Jersey" ,"New Mexico" ,"New York","North Carolina" ,"North Dakota" 
				,"Ohio" ,"Oklahoma" ,"Oregon" ,"Pennsylvania" ,"Rhode Island" ,"South Carolina" ,"South Dakota" ,"Tennessee" 
				,"Texas" ,"Utah" ,"Vermont" ,"Virginia" ,"Washington" ,"West Virginia" ,"Wisconsin" ,"Wyoming");
		
		nameBox = new HBox(10);
		nameBox.getChildren().addAll(fNameLbl, fNameField, lNameLbl, lNameField);
		
		streetBox= new HBox(10);
		streetBox.getChildren().addAll(stNumbLbl, stNumbField, stNameLbl, stNameField);
		
		cityZipBox = new HBox(10);
		cityZipBox.getChildren().addAll(cityLbl, cityField, zipLbl, zipField, stateLbl, stateBox);
		
		addressBox = new VBox(10);
		addressBox.getChildren().addAll(streetBox, cityZipBox);
		
		personBox = new VBox(10);
		personBox.getChildren().addAll(nameBox, addressBox);

		
	}
	
	public VBox getPersonBox(){
		return personBox;
	}
	
	public String getFirstName(){
		return fNameField.getText();
	}
	
	public String getLastName(){
		return lNameField.getText();
	}
	public String getStreetNumber(){
		return stNumbField.getText();
	}
	public String getStreetName(){
		return stNameField.getText();
	}
	public String getCity(){
		return cityField.getText();
	}
	
	public String getState(){
		return stateBox.getValue();
	}
	
	public String getZip(){
		return zipField.getText();
	}
	
	public TextField getFNameField(){
		return fNameField;
	}
	public TextField getLNameField(){
		return lNameField;
		
	}
	public TextField getstNumbField(){
		return stNumbField;
	
	}
	public TextField getStNameField(){
		return stNameField;
	
	}
	public TextField getCityField(){
		return cityField;
	
	}
	public TextField getZipField(){
		return zipField;
	
	}

}

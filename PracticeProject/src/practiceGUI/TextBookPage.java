package practiceGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TextBookPage {
	//Title, author, publisher,  Isbn, Year, price
	Label textbookTitleLbl, textbookAuthorLbl, textbookPublisherLbl, textbookIsbnLbl, textbookPriceLbl, yearLbl;
	TextField textbookTitleField, textbookAuthorField, textbookPublisherField, textbookIsbnField, textbookPriceField, yearField;
	HBox titleBox, authorBox, publisherBox, isbnBox, priceBox, yearBox;
	VBox rootBox;
	Button addTextBookBtn;
	Scene textScene;

	//Thiink about set Text, default text But background.
	public TextBookPage(){
		textbookTitleLbl = new Label("Title: ");
		textbookAuthorLbl = new Label("Author: ");
		textbookPublisherLbl = new Label("Publisher: ");
		textbookIsbnLbl = new Label("Isbn: ");
		textbookPriceLbl = new Label("Price: ");
		textbookTitleField = new TextField();
		textbookAuthorField = new TextField();
		textbookPublisherField = new TextField();
		textbookIsbnField = new TextField();
		textbookPriceField = new TextField();
		yearLbl = new Label("Year: ");
		yearField = new TextField();
		titleBox = new HBox();
		authorBox = new HBox();
		publisherBox = new HBox();
		isbnBox = new HBox();
		yearBox = new HBox();
		priceBox = new HBox();
		rootBox = new VBox();
		addTextBookBtn = new Button("Add TextBook");

		titleBox.getChildren().addAll(textbookTitleLbl, textbookTitleField);
		authorBox.getChildren().addAll(textbookAuthorLbl, textbookAuthorField);
		publisherBox.getChildren().addAll(textbookPublisherLbl, textbookPublisherField);
		isbnBox.getChildren().addAll(textbookIsbnLbl, textbookIsbnField);
		priceBox.getChildren().addAll(textbookPriceLbl, textbookPriceField);
		yearBox.getChildren().addAll(yearLbl, yearField);

		rootBox.getChildren().addAll(titleBox,authorBox, publisherBox,isbnBox,yearBox, priceBox, addTextBookBtn);

		textScene = new Scene(rootBox);
	}

	public Scene getTextScene(){
		return textScene;
	}


	public Button getAddButton(){
		return addTextBookBtn;
	}
	
	//Getters for that - String values
	public String getTitle(){
		return textbookTitleField.getText();
	}
	
	public String getAuthor(){
		return textbookAuthorField.getText();
	}
	
	public String getPublisher(){
		return textbookPublisherField.getText();
	}
	
	public String getIsbn(){
		return textbookIsbnField.getText();
	}
	
	public String getYear(){
		return yearField.getText();
	}
	
	public String getPrice(){
		return textbookPriceField.getText();
	}
	
	public TextField getTitleField(){
		return textbookTitleField;
	}
	public TextField getAuthorField(){
		return textbookAuthorField;
	}
	public TextField getPublisherField(){
		return textbookPublisherField;
	}
	public TextField getIsbnField(){
		return textbookIsbnField;
	}
	public TextField getYearField(){
		return yearField;
	}
	
	public TextField getPriceField(){
		return textbookPriceField;
	}

}

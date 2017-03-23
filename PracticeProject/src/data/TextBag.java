package data;

import java.util.ArrayList;

public class TextBag {
	
	private ArrayList<TextBook> tBag = new ArrayList<>();

	public TextBag() {
		super();
	}
	
	//Add
	public void addTextBook(TextBook book){
		tBag.add(book);
	}
	
	//Find
	public TextBook findTextBook(String isbn){
		for(TextBook b : tBag){
			if(b.getIsbn().equals(isbn)){
				return b;
			}
		}
		return null;
	}
	
	//Delete - custom
	public TextBook deleteTextBook(String isbn){
		int counter = 0;
		for(TextBook t : tBag){
			if(t.getIsbn().equals(isbn))
				break;
			counter++;
		}
		if(counter < tBag.size()){
			return tBag.remove(counter);
		}
		return null;
	}
	
	//Display - this may be obsolete, with other idea of just getting the bag.
	public void displayTextBook(){
		for(TextBook b : tBag){
			System.out.println(b);
		}
	}
	//Save
	
	//Load

	public ArrayList<TextBook> gettBag() {
		return tBag;
	}

	public void settBag(ArrayList<TextBook> tBag) {
		this.tBag = tBag;
	}
	
	
}

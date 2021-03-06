package model;
import java.io.Serializable;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Address implements Serializable{
	
	private String stNumber;
	private String stName;
	private String city;
	private String state;
	private String zip;
	public Address(String stNumber, String stName, String city, String state, String zip) {
		super();
		Scanner kb = new Scanner(System.in);
		while (true) {
			if (zip.length() != 5) {
				try {
					throw new ZipException("Error: The zip is not five characters");
				} catch (ZipException e) {
//					System.out.println(e.getMessage());
					zip = JOptionPane.showInputDialog(e.getMessage() + "\nEnter a correct Zip");
				}
			} else {
				break;
			}
		}
		
		
		this.stNumber = stNumber;
		this.stName = stName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	
	}
	//Overloaded constructor --- deep copy
	public Address(Address a){
		this.stNumber = a.getStNumber();
		this.stName = a.getStName();
		this.city = a.getCity();
		this.state = a.getState();
		this.zip = a.getZip();
	}
	
	public String getStNumber() {
		return stNumber;
	}
	public void setStNumber(String stNumber) {
		this.stNumber = stNumber;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return stNumber +" " + stName + " , "+ city + ", " + state + " , " + zip;
	}

}

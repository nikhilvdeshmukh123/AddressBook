package com.Bridgelabz;

public class AddressBook {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	long zip;
	String phoneNumber;
	String email;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		
		AddressBook contact = new AddressBook();
		contact.firstName = "Nikhil";
		contact.lastName = "Deshmukh";
		contact.address = "Loni BK";
		contact.city = "Ahmednagar";
		contact.state = "Maharashtra";
		contact.zip = 422610;
		contact.phoneNumber = "9637863774";
		contact.email = "deshmukhnikhil81@gmail.com";
	}
}
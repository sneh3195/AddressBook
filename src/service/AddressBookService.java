package service;
import java.util.ArrayList;
import java.util.Scanner;

import entity.AddressBook;
import entity.ContactPerson;

public class AddressBookService {
public void addContact() {
		
		ArrayList<ContactPerson> contacts = AddressBook.getContacts();
		
		Scanner input = new Scanner(System.in);
		System.out.print(" ENTER FIRST NAME: ");
		String firstName = input.next();
		
		System.out.print(" ENTER LAST NAME:");
		String lastName = input.next();
		
		System.out.print(" ENTER ADDRESS: ");
		String address = input.next();
		
		System.out.print(" ENTER CITY: ");
		String city = input.next();
		
		System.out.print(" ENTER YOUR STATE: ");
		String state = input.next();
		
		System.out.print(" ENTER ZIP-CODE: ");
		int zip =input.nextInt();
		
		System.out.print("ENTER PHONE NO: ");
		int phoneNumber = input.nextInt();
		
		System.out.print(" Please enter the email: ");
		String email = input.next();
		
		ContactPerson newContact = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contacts.add(newContact);
		AddressBook.setContacts(contacts);
		 
		System.out.println(newContact);
	}
	
	public void printContacts() {
		
		ArrayList<ContactPerson> contacts = AddressBook.getContacts();
		
		for (ContactPerson contactPerson : contacts) {
			System.out.println(contactPerson);
		}
	}
}

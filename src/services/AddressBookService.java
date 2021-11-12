package services;

import java.util.Scanner;

public class AddressBookService {
public void addContact() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("ENTER FIRST NAME: ");
		String firstName = input.next();
		
		System.out.print(" ENTER LAST NAME: ");
		String lastName = input.next();
		
		System.out.print(" ENTER ADDRESS: ");
		String address = input.next();
		
		System.out.print(" ENTER CITY: ");
		String city = input.next();
		
		System.out.print(" ENTER STATE: ");
		String state = input.next();
		
		System.out.print(" ENTER ZIP CODE: ");
		int zip = input.nextInt();
		
		System.out.print(" ENTER CONTACT DETAILS: ");
		int phoneNumber = input.nextInt();
		
		System.out.print(" ENTER EMAIL-ID: ");
		String email = input.next();
		
		ContactPerson CP = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
		System.out.println(CP);
	}
}

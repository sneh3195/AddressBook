package service;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
  System.out.println(" Welcome to Address Book ");
		
		Scanner input = new Scanner(System.in);
		int ch;
		
		AddressBookService ABS = new AddressBookService();
		
		while (true) {
			System.out.println(" 1. Add\n 2. Print Contacts\n 3. Exit ");
			System.out.println(" Please enter your choice: ");
			
			ch = input.nextInt();
			
			switch(ch) {
			case 1: 
				ABS.addContact();
				break;
			case 2: 
				ABS.printContacts();
				break;
				
			case 3:
				ABS.editContact();
				break;
			case 4:
				System.out.println("BYE!!!!Have a Nice Day ");
				input.close();
				return;
			}
		}
	}

}


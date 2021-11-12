package services;

public class AddressBookMain {

	public static void main(String[] args) {
  System.out.println(" Welcome to Address Book Program");
		
		AddressBookService ABS = new AddressBookService();
		ABS.addContact();
	}

}

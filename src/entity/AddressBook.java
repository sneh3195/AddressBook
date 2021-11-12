package entity;
import java.util.ArrayList;
public class AddressBook {
	
	
	public static ArrayList<ContactPerson> contact = new ArrayList<ContactPerson>();

	public static ArrayList<ContactPerson> getContacts() {
		return contact;
	}

	public static void setContacts(ArrayList<ContactPerson> contacts) {
		AddressBook.contact = contacts;
	}
	
	

}

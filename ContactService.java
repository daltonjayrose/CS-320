package contact;
import java.util.ArrayList;

public class ContactService {

	// Initializes a list of contacts
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// Creates a contact and adds that contact to contactList
	public void addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact newContact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		contactList.add(newContact);
	}
	
	// Searches for a contact by contactID and removes that contact from contactList.
	public void removeContact(String contactID) {
		for (int i = 0; i < contactList.size(); ++i) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.remove(i);
				return;
			}
		}
	}
	
	// Searches for a contact by contactID and updates that contact's firstName.
	public void updateFirstName(String contactID, String newName) {
		for (int i = 0; i < contactList.size(); ++i) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setFirstName(newName);
				return;
			}
		}
	}
	
	// Searches for a contact by contactID and updates that contact's lastName.
	public void updateLastName(String contactID, String newName) {
		for (int i = 0; i < contactList.size(); ++i) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setLastName(newName);
				return;
			}
		}
	}
	
	// Searches for a contact by contactID and updates that contact's phoneNumber.
	public void updatePhoneNumber(String contactID, String newPhoneNumber) {
		for (int i = 0; i < contactList.size(); ++i) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setPhoneNumber(newPhoneNumber);
				return;
			}
		}
	}
	
	// Searches for a contact by contactID and updates that contact's address.
	public void updateAddress(String contactID, String newAddress) {
		for (int i = 0; i < contactList.size(); ++i) {
			if (contactID == contactList.get(i).getContactID()) {
				contactList.get(i).setAddress(newAddress);
				return;
			}
		}
	}
	
}

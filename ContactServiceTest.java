package contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	@DisplayName("Contact added to contact list successfully with addContact()")
	void testAddContact() {
		// Initialize a ContactService object and add a contact to the contact list.
		ContactService Test = new ContactService();
		Test.addContact("001", "John", "Smith", "1234567890", "Address #1");
		
		// Test that the contact was successfully added to the list.
		assertTrue(Test.contactList.size() == 1);
	}
	
	@Test
	@DisplayName("Contact removed from contact list successfully with removeContact()")
	void testRemoveContact() {
		// Initialize a ContactService object and add a contact to the contact list.
		ContactService Test = new ContactService();
		Test.addContact("001", "John", "Smith", "1234567890", "Address #1");
		
		// Remove the contact from the contact list and test that it was successfully removed.
		Test.removeContact("001");
		assertTrue(Test.contactList.size() == 0);
	}
	
	@Test
	@DisplayName("Contact's firstName successfully updated with updateFirstName()")
	void testUpdateFirstName() {
		// Initialize a ContactService object and add a contact to the contact list.
		ContactService Test = new ContactService();
		Test.addContact("001", "John", "Smith", "1234567890", "Address #1");
		
		// Change the contact's first name and and test to see that it was successfully changed.
		Test.updateFirstName("001", "Jane");
		assertTrue(Test.contactList.get(0).getFirstName() == "Jane");
	}

	@Test
	@DisplayName("Contact's lastName successfully updated with updateLastName()")
	void testUpdateLastName() {
		// Initialize a ContactService object and add a contact to the contact list.
		ContactService Test = new ContactService();
		Test.addContact("001", "John", "Smith", "1234567890", "Address #1");
		
		// Change the contact's last name and and test to see that it was successfully changed.
		Test.updateLastName("001", "Fields");
		assertTrue(Test.contactList.get(0).getLastName() == "Fields");
	}
	
	@Test
	@DisplayName("Contact's phoneNumber successfully updated with updatePhoneNumber()")
	void testUpdatePhoneNumber() {
		// Initialize a ContactService object and add a contact to the contact list.
		ContactService Test = new ContactService();
		Test.addContact("001", "John", "Smith", "1234567890", "Address #1");
		
		// Change the contact's phone number and and test to see that it was successfully changed.
		Test.updatePhoneNumber("001", "0987654321");
		assertTrue(Test.contactList.get(0).getPhoneNumber() == "0987654321");
	}
	
	@Test
	@DisplayName("Contact's address successfully updated with updateAddress()")
	void testUpdateAddress() {
		// Initialize a ContactService object and add a contact to the contact list.
		ContactService Test = new ContactService();
		Test.addContact("001", "John", "Smith", "1234567890", "Address #1");
		
		// Change the contact's address and and test to see that it was successfully changed.
		Test.updateAddress("001", "Address #2");
		assertTrue(Test.contactList.get(0).getAddress() == "Address #2");
	}
}

package contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	@DisplayName("Creating a new contact is successful.")
	void testCreateContact() {
		Contact testContact = new Contact("00120012", "Test", "User", "1235557890", "Test Address");
		assertTrue(testContact.getContactID().equals("00120012"));
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a contact ID that is too long results in an IllegalArgumentException.")
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Testing contactID too long", "Test", "User", "1235557890", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a first name that is too long results in an IllegalArgumentException.")
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("320", "Testing firstName Too Long", "User", "1235557890", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a last name that is too long results in an IllegalArgumentException.")
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("320", "Test", "Testing lastName Too Long", "1235557890", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a phone number that is too short results in an IllegalArgumentException.")
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("320", "Test", "User", "12355", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a phone number that is too long results in an IllegalArgumentException.")
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("320", "Test", "User", "12355578901", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with an address that is too long results in an IllegalArgumentException.")
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("320", "Test", "User", "1235557890", "Testing for if the address is toooo long.");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a null contact ID results in an IllegalArgumentException.")
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Test", "User", "1235557890", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a null first name results in an IllegalArgumentException.")
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Testing contactID too long", null, "User", "1235557890", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a null last name results in an IllegalArgumentException.")
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Testing contactID too long", "Test", null, "1235557890", "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a null phone number results in an IllegalArgumentException.")
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Testing contactID too long", "Test", "User", null, "Test Address");
		});
	}
	
	@Test
	@DisplayName("Attempting to create a contact with a null address results in an IllegalArgumentException.")
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Testing contactID too long", "Test", "User", "1235557890", null);
		});
	}
	
	@Test
	@DisplayName("Attempting to update a contact with a null address results in an IllegalArgumentException.")
	void testSetAddressNull() {
		Contact testContact = new Contact("00120012", "Test", "User", "1235557890", "Test Address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setAddress(null);
		});
	}
	
	@Test
	@DisplayName("Attempting to update a contact with a null first name results in an IllegalArgumentException.")
	void testSetFirstNameNull() {
		Contact testContact = new Contact("00120012", "Test", "User", "1235557890", "Test Address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setFirstName(null);
		});
	}
	
	@Test
	@DisplayName("Attempting to update a contact with a null last name results in an IllegalArgumentException.")
	void testSetLastNameNull() {
		Contact testContact = new Contact("00120012", "Test", "User", "1235557890", "Test Address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setLastName(null);
		});
	}

	@Test
	@DisplayName("Attempting to update a contact with a null phone number results in an IllegalArgumentException.")
	void testSetPhoneNumberNull() {
		Contact testContact = new Contact("00120012", "Test", "User", "1235557890", "Test Address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhoneNumber(null);
		});
	}
}

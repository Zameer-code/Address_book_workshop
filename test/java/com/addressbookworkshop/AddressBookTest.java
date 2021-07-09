package com.addressbookworkshop;

import org.junit.Test;
import org.junit.Assert;

public class AddressBookTest {
	
	@Test
	public void givenContactInAddressBookReturnTrue() {
		AddressBook addressBook = new AddressBook();
        ContactInfo contacts = new ContactInfo("Jackson", "Briggs", "Street69", "Bangalore", "Karnataka", 580002, 789249668, "jack@gmail.com");
        boolean result = addressBook.addContacts(contacts);
        Assert.assertTrue(result);

	}
}


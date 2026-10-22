import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Terrell",
                "Lojik",
                "5551234567",
                "123 Main Street"
        );

        service.addContact(contact);

        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    public void testAddDuplicateContactId() {
        ContactService service = new ContactService();

        Contact contact1 = new Contact(
                "12345",
                "Terrell",
                "Lojik",
                "5551234567",
                "123 Main Street"
        );

        Contact contact2 = new Contact(
                "12345",
                "John",
                "Smith",
                "5559876543",
                "456 Oak Street"
        );

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () ->
                service.addContact(contact2)
        );
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Terrell",
                "Lojik",
                "5551234567",
                "123 Main Street"
        );

        service.addContact(contact);
        service.deleteContact("12345");

        assertThrows(IllegalArgumentException.class, () ->
                service.getContact("12345")
        );
    }

    @Test
    public void testUpdateFirstName() {
        ContactService service = createService();

        service.updateFirstName("12345", "John");

        assertEquals("John",
                service.getContact("12345").getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        ContactService service = createService();

        service.updateLastName("12345", "Smith");

        assertEquals("Smith",
                service.getContact("12345").getLastName());
    }

    @Test
    public void testUpdatePhone() {
        ContactService service = createService();

        service.updatePhone("12345", "5559876543");

        assertEquals("5559876543",
                service.getContact("12345").getPhone());
    }

    @Test
    public void testUpdateAddress() {
        ContactService service = createService();

        service.updateAddress("12345", "456 Oak Street");

        assertEquals("456 Oak Street",
                service.getContact("12345").getAddress());
    }

    private ContactService createService() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
                "12345",
                "Terrell",
                "Lojik",
                "5551234567",
                "123 Main Street"
        );

        service.addContact(contact);

        return service;
    }
}
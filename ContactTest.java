import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testValidContact() {
        Contact contact = new Contact(
                "12345",
                "Terrell",
                "Lojik",
                "5551234567",
                "123 Main Street"
        );

        assertEquals("12345", contact.getContactId());
        assertEquals("Terrell", contact.getFirstName());
        assertEquals("Lojik", contact.getLastName());
        assertEquals("5551234567", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testContactIdExactlyTenCharacters() {
        assertDoesNotThrow(() ->
                new Contact(
                        "1234567890",
                        "Terrell",
                        "Lojik",
                        "5551234567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345678901",
                        "Terrell",
                        "Lojik",
                        "5551234567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        null,
                        "Terrell",
                        "Lojik",
                        "5551234567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Christopher",
                        "Lojik",
                        "5551234567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        null,
                        "Lojik",
                        "5551234567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Terrell",
                        "ABCDEFGHIJK",
                        "5551234567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Terrell",
                        null,
                        "5551234567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testPhoneTooShort() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Terrell",
                        "Lojik",
                        "555123456",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testPhoneContainsLetters() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Terrell",
                        "Lojik",
                        "555ABC4567",
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Terrell",
                        "Lojik",
                        null,
                        "123 Main Street"
                )
        );
    }

    @Test
    public void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Terrell",
                        "Lojik",
                        "5551234567",
                        "1234567890123456789012345678901"
                )
        );
    }

    @Test
    public void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "12345",
                        "Terrell",
                        "Lojik",
                        "5551234567",
                        null
                )
        );
    }
}
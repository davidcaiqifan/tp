package seedu.address.testutil;

import seedu.address.model.ContactList;
import seedu.address.model.ModuleList;
import seedu.address.model.contact.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static seedu.address.logic.commands.CommandTestUtil.*;

public class TypicalContact {
    public static final Contact ALICE = new ContactBuilder().withName("Alice Pauline")
            .withEmail("alice@example.com").withTelegram("@alice")
            .withTags("friends").build();
    public static final Contact BENSON = new ContactBuilder().withName("Benson Meier")
            .withEmail("johnd@example.com").withTelegram("@benson")
            .withTags("owesMoney", "friends").build();
    public static final Contact CARL = new ContactBuilder().withName("Carl Kurz")
            .withTelegram("@carl")
            .withEmail("heinz@example.com").build();
    public static final Contact DANIEL = new ContactBuilder().withName("Daniel Meier")
            .withEmail("cornelia@example.com").withTelegram("@daniel").withTags("friends").build();
    public static final Contact ELLE = new ContactBuilder().withName("Elle Meyer").withTelegram("@elle")
            .withEmail("werner@example.com").build();
    public static final Contact FIONA = new ContactBuilder().withName("Fiona Kunz").withTelegram("@fiona")
            .withEmail("lydia@example.com").build();
    public static final Contact GEORGE = new ContactBuilder().withName("George Best").withTelegram("@george")
            .withEmail("anna@example.com").build();

    // Manually added
    public static final Contact HOON = new ContactBuilder().withName("Hoon Meier")
            .withEmail("stefan@example.com").withTelegram("@hoon").build();
    public static final Contact IDA = new ContactBuilder().withName("Ida Mueller")
            .withEmail("hans@example.com").withTelegram("@ida").build();

    // Manually added - Contact's details found in {@code CommandTestUtil}
    public static final Contact AMY = new ContactBuilder().withName(VALID_NAME_AMY)
            .withEmail(VALID_EMAIL_AMY).withTelegram(VALID_TELEGRAM_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Contact BOB = new ContactBuilder().withName(VALID_NAME_BOB)
            .withEmail(VALID_EMAIL_BOB).withTelegram(VALID_TELEGRAM_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalContact() {} // prevents instantiation

    /**
     * Returns an {@code ContactList} with all the typical contacts.
     */
    public static ContactList getTypicalContactList() {
        ContactList contactList = new ContactList();
        for (Contact contact : getTypicalContacts()) {
            contactList.addContact(contact);
        }
        return contactList;
    }

    public static List<Contact> getTypicalContacts() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}

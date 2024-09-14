import java.util.HashMap;
import java.util.Map;

public class ContactDictionary {
    Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String number) {
        contacts.put(name, number);
    }
    public void removeContact(String name) {
        contacts.remove(name);
    }
    public String findContact(String name) {
        return contacts.get(name);
    }
    public Map<String, String> getAllContact() {
        return contacts;
    }
}

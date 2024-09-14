import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ContactDictionary contactDictionary = new ContactDictionary();
        AnagramUtils anagramUtils = new AnagramUtils();
        AnagramMap anagramMap = new AnagramMap();
        System.out.println(anagramUtils.groupAnagrams(strs));
        contactDictionary.addContact("Adil", "996999111111");
        System.out.println(contactDictionary.findContact("Adil"));
    }
}
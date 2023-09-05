import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        addContact(phoneBook, "AAAA", "1234567890");
        addContact(phoneBook, "SSSS", "9876543210");
        addContact(phoneBook, "SSSS", "9534543210");
        addContact(phoneBook, "XXXX", "5432109876");
        addContact(phoneBook, "XXXX", "54321098760");
        addContact(phoneBook, "XXXX", "54321098761");
        System.out.println(phoneBook);
    }

    public static void addContact(HashMap<String, ArrayList<String>> phoneBook, String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }
}

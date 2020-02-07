package homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> myPhoneBook;

    public Phonebook() {
        this.myPhoneBook = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (!myPhoneBook.containsKey(surname)) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(phone);
            myPhoneBook.put(surname, arrayList);
        } else myPhoneBook.get(surname).add(phone);
    }

    public ArrayList<String> get(String surname) {
        return myPhoneBook.get(surname);
    }
}
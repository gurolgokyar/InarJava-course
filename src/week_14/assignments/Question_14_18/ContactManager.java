package week_14.assignments.Question_14_18;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, String> contacts;

    public ContactManager(){
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber){
        contacts.put(name, phoneNumber);
    }

    public String searchByName(String name){
        return contacts.get(name);
    }

    public String searchByPhoneNumber(String phoneNumber){
       for (Map.Entry<String, String> entry : contacts.entrySet()){
           if (entry.getValue().equals(phoneNumber)){
               return entry.getKey();
           }
       }
       return "There is not the name with " + phoneNumber;
    }
}

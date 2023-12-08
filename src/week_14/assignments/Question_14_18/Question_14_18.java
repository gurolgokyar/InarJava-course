package week_14.assignments.Question_14_18;

public class Question_14_18 {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Steve Doe", "123-456-7890");
        contactManager.addContact("Jane Smith", "542-330-59-60");

        System.out.println("Steve Doe's Phone Number: " + contactManager.searchByName("Steve Doe"));
    }
}

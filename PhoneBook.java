import java.util.Map.Entry;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Phone Book App!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a contact");
            System.out.println("2. Search for a contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            System.out.println("5. PhoneBook: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    phoneBook.put(name, phone);
                    break;
                case 2:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Phone number for " + searchName + " is: " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the name to delete: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.remove(deleteName);
                    System.out.println(deleteName + "'s contact has been deleted.");
                    break;
                case 4:
                    System.out.println("Exiting Phone Book App. Goodbye!");
                    System.exit(0);
                    break;
                case 5:
                
                System.out.println(phoneBook);
                break;

        }
    }
}}
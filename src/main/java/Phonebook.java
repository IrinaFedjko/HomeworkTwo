import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {

    public static ArrayList<String> contacts = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public void toSeeAllActivities() {
        System.out.println("Write the number for activity you want to perform: \n" +
                "1. Check all contacts\n" +
                "2. Add new contact\n" +
                "3. Remove contact \n" +
                "4. Find by name or phone number\n" +
                "5. Update contacts\n" +
                "6. Find by letter or part phone number");
    }

    public void toSeellContacts() throws IOException, NullPointerException {
        FileReader fileReader = new FileReader("src/main/java/myPhoneBook.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int userInput = scan.nextInt();
        if (userInput == 1) {
            String line = bufferedReader.readLine();
            while (line != null) {
                contacts.add(line);
                line = bufferedReader.readLine();
                for (String contact : contacts) {
                    System.out.println(contact);
                }
            }
        }

        if (userInput == 2) {

            System.out.println("Please write a name: ");
            String userInputName = scan.next();
            if (userInputName != null) {
                System.out.println("Name " + userInputName + " has been added to phonebook.");
            }
            System.out.println("Please write phone number: ");
            String userInputPhoneNumber = scan.next();
            if (userInputPhoneNumber != null) {
                System.out.println("Phone number " + userInputPhoneNumber + "has been added to phonebook.");
            }
            System.out.println("Please write email (optional): ");
            String userInputEmail = scan.next();
            if (userInputEmail != null) {
                System.out.println("Email was added");

            }
            String line = bufferedReader.readLine();
            while (line != null) {
                contacts.add(line);
                line = bufferedReader.readLine();
                contacts.add(String.valueOf(new Contacts(userInputName, userInputPhoneNumber, userInputEmail)));
                System.out.println(contacts);
            }
        }

        if (userInput == 3) {

            System.out.println("Which contact would you wanna to remove?");
            String contactToRemove = scan.next();

            String line = bufferedReader.readLine();
            while (line != null) {
                contacts.add(line);
                line = bufferedReader.readLine();

                contacts.remove(contactToRemove);

                System.out.println("Contact" + contactToRemove + "was removed");

                System.out.println(contacts);
            }
        }
        if (userInput == 4) {
            System.out.println("Write name or phone number to find: ");
            String userInputName = scan.next();

            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
                contacts.add(line);

                for (String contact : contacts) {

                    if (contact.contains(userInputName)) {
                        System.out.println(contact);
                    }
                }
            }
        }


        if (userInput == 5) {
            System.out.println("Which contact would you like to update?");

            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
                contacts.add(line);
                contacts.set(0, String.valueOf(new Contacts("Kate", "371-98", "q@gmail.com")));
                for (String contact : contacts) {
                    System.out.println(contact);
                }
            }
        }
        if (userInput == 6) {
            System.out.println("Find different contacts by part of name of contact or part of phone number: ");
            String userInputLetter = scan.next();
            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();
                contacts.add(line);


                for (String contact : contacts) {
                    if (contact.contains(userInputLetter)) System.out.println(contact);

                }

            }

        }

    }

}



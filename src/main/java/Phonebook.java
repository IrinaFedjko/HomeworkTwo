import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        FileReader fileReader = new FileReader("src/main/java/myPhoneBook.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        System.out.println("Write the number for activity you want to perform: \n" +
                "1. Check all contacts\n" +
                "2. Add new contact\n" +
                "3. Find by name or phone number\n" +
                "4. Update contacts\n");

        int userInput = scan.nextInt();
        if (userInput == 1) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
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

            System.out.println("New contact " + userInputName + "," + userInputPhoneNumber + "," + userInputEmail);
        }

    }
}


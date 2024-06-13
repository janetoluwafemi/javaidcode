package tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticePhoneBook {
   static ArrayList<String[]> Contacts = new ArrayList<String[]>();
   public static void main(String[] args) {
       goToMainMenu();
   }
   public static void goToMainMenu() {
       String prompt = """
               1 -> Add contact to Phone Book
               2 -> remove contact from Phone Book
               3 -> find contact from Phone Book by phone number
               4 -> find contact from Phone Book by first name
               5 -> find contact from Phone Book by last name
               6 -> Exit
               """;
                System.out.print(prompt);
                String phoneBookOptions = inputOptions(prompt);
                switch (phoneBookOptions) {
                    case "1" -> addContact();
                    case "2" -> removeContact();
                    case "3" -> findContactByFirstName();
                    case "4" -> findContactByLastName();
                    case "5" -> findContactByPhoneNumber();
                    case "6" -> System.exit(0);
                    default -> System.out.println("Invalid option");
                }
       }
    private static void checkContacts(){
       for(String[] contact: Contacts){
           promptChecking(contact);
       }
    }

    private static void promptChecking(String[] contact) {
       System.out.print(Arrays.toString(contact));
    }

    private static void findContactByFirstName() {
       String personFirstName = inputOptions("Enter First Name");
       for(String[] contact: Contacts) {
           for(String elements : contact){
               if(elements.equals(personFirstName)) {
                   promptChecking(contact);
               }
           }
       }
        goToMainMenu();
    }
    private static void findContactByPhoneNumber() {
       String personPhoneNumber = inputOptions("Enter Phone Number");
       for(String[] contact: Contacts) {
           for(String elements : contact){
               if(elements.equals(personPhoneNumber)) {
                   promptChecking(contact);
               }
           }
       }
        goToMainMenu();
    }

    public static void validating(String valindatingContact){
       String contactsNotFound = "false";
       for (String[] contact : Contacts) {
           for (String elements : contact) {
               if(elements.equals(valindatingContact)) {
                   contactsNotFound = "true";
               }
           }

       }
        if(contactsNotFound.equals("true")){
            addContact();
        }
    }
    private static void findContactByLastName() {
       String lastName = inputOptions("Enter last name");
       for (String[] contact : Contacts) {
           for (String element : contact) {
               if (element.equals(lastName)) {
                   promptChecking(contact);
               }

           }
       }
        goToMainMenu();
    }

    private static void removeContact() {
       String personPhoneNumber = inputOptions("Enter Phone Number");
       for (String[] contact : Contacts) {
           for (String element : contact) {
               if (element.equals(personPhoneNumber)) {
                   promptChecking(contact);
               }
           }
       }
        goToMainMenu();
    }

    public static void addContact(){
       String personFirstName = inputOptions("Enter the first name of the contact you would like to add: ");
       String personLastName = inputOptions("Enter the last name of the contact you would like to add: ");
       String personPhoneNumber = inputOptions("Enter the phone number you would like to add: ");
       for(String[] contact : Contacts) {
           for(String element : contact) {
               promptChecking(contact);
           }
       }
        goToMainMenu();
    }

    public static String inputOptions(String display){
        Scanner scanner = new Scanner(System.in);
        System.out.print(display);
        return scanner.next();
    }
}

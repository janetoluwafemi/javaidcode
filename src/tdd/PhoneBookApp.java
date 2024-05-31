package tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookApp {
    static ArrayList<String[]> contacts = new ArrayList<>();
    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
        String prompt = """
                Welcome to phone book application!
                1 -> Add Contact to Phone Book
                2 -> Remove Contact from Phone Book
                3 -> Find Contact from Phone Book by phone number
                4 -> Find Contact from Phone Book by first name
                5 -> Find Contact from Phone Book by last name
                6 -> Exit
                """;
        String inputForgoToMainMenu = input(prompt);
        switch (inputForgoToMainMenu) {
            case "1" -> addContact();
            case "2" -> removeContact();
            case "3" -> findContactByPhoneNumber();
            case "4" -> findContactByFirstName();
            case "5" -> findContactBySecondName();
            case "6" -> checkAllContacts();
            case "7" -> System.exit(0);
            default -> System.out.println("Invalid input");
        }
    }

    private static void checkAllContacts() {
        for(String[] contact: contacts){
          promptArray(contact);
        }

    }

    private static void promptArray(String[] contact) {
        System.out.println(Arrays.toString(contact));
    }

    private static void findContactBySecondName() {
        String secondName = input("Enter the name of the contact you would like to search: ");
        for (String[] contact: contacts) {
            for(String elements : contact){
                if(elements.equals(secondName)){
                    promptArray(contact);
                }
            }
        }
        goToMainMenu();
    }

    private static void findContactByFirstName() {
        String firstName = input("Enter the name of the contact you would like to search: ");
        for (String[] contact: contacts) {
            for(String elements : contact){
                if(elements.equals(firstName)){
                    promptArray(contact);
                }
            }
        }
        goToMainMenu();
    }

    private static void findContactByPhoneNumber() {
        String phoneNumber = input("Enter the phone number you would like to search: ");
        for (String[] contact: contacts) {
            for(String elements : contact){
                if(phoneNumber.equals(elements)){
                    promptArray(contact);
                }
            }
        }
        goToMainMenu();
    }

    private static void removeContact() {
        String phoneNumberToRemove = input("Enter the person number to remove: ");
        for(String[] contact: contacts){
            for(String elements : contact){
                if(phoneNumberToRemove.equals(elements)){
                    contacts.remove(contact);
                }
                break;
            }
        }
        goToMainMenu();
    }

    private static void addContact() {
        String personFirstName = input("Enter first name: ");
        String personLastName = input("Enter last name: ");
        String personPhoneNumber = input("Enter phone number: ");
        String[] contact = new String[]{personFirstName,personLastName,personPhoneNumber};
        valindating(contact);
        contacts.add(contact);
        goToMainMenu();
    }

    private static void valindating(String[] valindatingContact) {
        String personContact = valindatingContact[2];
        String contactNotFound = "false";
        for(String[] contact: contacts){
            for(String elements : contact){
                if(elements.equals(personContact)){
                    contactNotFound = "true";
                }
            }
        }
        if(contactNotFound.equals("true"))addContact();
    }
    private static String input(String display) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(display);
        return scanner.next();
    }
}



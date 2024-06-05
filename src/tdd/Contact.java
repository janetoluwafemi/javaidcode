package tdd;

public class Contact {
    private String firstName;
    private String lastName;
    private int phoneNumber;

    public Contact(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int checkHowManyContactYouHave() {
       phoneNumber = phoneNumber + 1;
       return phoneNumber;
    }
}

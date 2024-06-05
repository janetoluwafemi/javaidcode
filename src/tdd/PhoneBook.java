package tdd;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> Cntacts = new ArrayList<>();

    public void createContact() {
        Contact janet = new Contact("oluwafemi","janet",4464);
        Cntacts.add(janet);
    }
}

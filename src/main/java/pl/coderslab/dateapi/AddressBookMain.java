package pl.coderslab.dateapi;

import java.util.Optional;

public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Optional<String> sadsa =
                addressBook.findAddressByName("sadsa");

        sadsa.ifPresent(s -> System.out.println(s));
    }
}

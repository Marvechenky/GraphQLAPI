package dev.marve.graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Address(Integer id, String houseNumber, String streetName,
                      String city, String state) {


    public static List<Address> addresses = Arrays.asList(

            new Address(1, "45", "James Musa Avenue", "Isolo", "Lagos"),
            new Address(2, "6", "Yakubu Gowon Road", "Wuse", "Abuja"),
            new Address(3, "89", "Jimoh Ibrahim Lane", "Akoko", "Ondo"),
            new Address(4, "60", "Mike Okiro Close", "Eket", "Cross-River"),
            new Address(5,"100", "Tinubu Imam street", "Osogbo", "Osun")

    );


    public static Optional<Address> getAddressById(Integer id){
        return addresses.stream()
                .filter(address -> address.id.equals(id))
                .findFirst();
    }
}

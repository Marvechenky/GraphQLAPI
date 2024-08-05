package dev.marve.graphql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record User(Integer id,
                   String firstName,
                   String lastName,
                   String email,
                   String phoneNumber,
                   Integer addressId) {

    public static List<User> users = Arrays.asList(
            new User(1, "Ibrahim", "Sodiq", "ibro419@yahoo.com", "08096754327",1),
            new User(2, "Jerry", "Awilo", "jerry_awilo@yahoo.com", "08035954320", 2),
            new User(3, "Fred", "Roland", "fred.rowland@yahoo.com", "08176094322", 3),
            new User(4, "Zach", "Tolulope", "toluzach@gmail.com", "080260599320", 4),
            new User(5, "Musa", "Opeoluwa", "opemusa@gmail.com", "090545432013", 5)
    );



    public static Optional<User> getUserById(Integer id) {
        return users.stream()
                .filter(user -> user.id.equals(id))
                .findFirst();
    }

}

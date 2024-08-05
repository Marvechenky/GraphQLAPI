package dev.marve.graphql;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
public class UserController {

    @QueryMapping
    public List<User> users(){
            return User.users;
    }


    @QueryMapping
    public Optional<User> userById(@Argument Integer id){
        return User.getUserById(id);
    }


    @SchemaMapping
    public static Optional<Address> address(User user){
        return Address.getAddressById(user.addressId());
    }
}

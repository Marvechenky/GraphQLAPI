package dev.marve.graphql;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class AddressController {

    @QueryMapping
    public List<Address> addresses() {
        return Address.addresses;
    }

    @QueryMapping
    public Optional<Address> addressById(@Argument Integer id){
        return Address.getAddressById(id);
    }
}

package dev.marve.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;



@GraphQlTest(UserController.class)
class UserControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void canGetUsers() {
        graphQlTester.documentName("users")
                .execute()
                .path("users")
                .entityList(User.class)
                .hasSize(5);
    }
}
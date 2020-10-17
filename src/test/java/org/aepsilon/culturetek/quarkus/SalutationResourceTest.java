package org.aepsilon.culturetek.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SalutationResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/bonjour")
          .then()
             .statusCode(200)
             .body(is("Bonjour le monde Maj"));
    }

    @Test
    public void testSalutation(){
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("name", uuid)
                .when().get("/bonjour/salutation/{name}")
                .then()
                .statusCode(200)
                .body(is("Bonjour " + uuid));
    }


}
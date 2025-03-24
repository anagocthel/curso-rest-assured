package br.com.anagocthel.rest;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class OlaMundoTest {
    @Test
    public void testOlaMundo(){
        given()
                .when()
                    .get("http://restapi.wcaquino.me/ola")
                .then()
                    .statusCode(200);
    }
}

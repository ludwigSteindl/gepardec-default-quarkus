package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

@QuarkusTest
class Junit4Test {

    @BeforeEach
    void setUp() {
        System.out.println("🚀 Testvorbereitung läuft...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("✅ Test abgeschlossen.");
    }

    @Test
    void helloEndpoint() {
        RestAssured.given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello from RESTEasy Reactive"));
    }
}
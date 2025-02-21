package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

@QuarkusTest
class Junit4Test {

    @Before
    public void setUp() {
        System.out.println("🚀 Testvorbereitung läuft...");
    }

    @After
    public void tearDown() {
        System.out.println("✅ Test abgeschlossen.");
    }

    @Test
    void testHelloEndpoint() {
        RestAssured.given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello from RESTEasy Reactive"));
    }
}
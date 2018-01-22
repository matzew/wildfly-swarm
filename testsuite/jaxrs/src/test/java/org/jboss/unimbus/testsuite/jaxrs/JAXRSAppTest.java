package org.jboss.unimbus.testsuite.jaxrs;

import io.restassured.RestAssured;
import org.jboss.unimbus.UNimbus;
import org.jboss.unimbus.test.UNimbusTestRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;

@RunWith(UNimbusTestRunner.class)
public class JAXRSAppTest {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    public void test() {
        when().get("/").then()
                .statusCode(200)
                .body(containsString("Hello from JAX-RS"));
    }
}

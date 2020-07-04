package TestCases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TC1_GET_Request {

    @Test
    public void getAllVideoGames(){
        given()
        .when()
                .get("http://localhost:8080/app/videogames")
        .then()
                .statusCode(200);
    }
}

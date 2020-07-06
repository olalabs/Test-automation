package TestCases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC1_GET_Request {

    @Test(priority = 1)
    public void getAllVideoGames(){
        given()
        .when()
                .get("http://localhost:8080/app/videogames")
        .then()
                .statusCode(200);
    }

    @Test(priority = 3)
    public void getVideoGameById(){
        given()
        .when()
                .get("http://localhost:8080/app/videogames/123")
        .then()
                .statusCode(200)
                .log().body()
                .body("videoGame.id", equalTo("123"))
                .body("videoGame.name", equalTo("Skyrim"));
    }
}

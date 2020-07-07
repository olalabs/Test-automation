package TestCases;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC3_PUT_Request {

    @Test(priority = 4)
    public void updateVideoGame(){
        HashMap data = new HashMap();
        data.put("id", "123");
        data.put("name", "Overwatch");
        data.put("releaseDate", "2016-05-24T10:32:31.420Z");
        data.put("reviewScore", "4");
        data.put("category", "Shooter");
        data.put("rating", "Universal");

        given()
                .contentType("application/json")
                .body(data)
        .when()
                .put("http://localhost:8080/app/videogames/123")
        .then()
                .statusCode(200)
                .log().body()
                .body("videoGame.id", equalTo("123"))
                .body("videoGame.name", equalTo("Overwatch"));
    }
}

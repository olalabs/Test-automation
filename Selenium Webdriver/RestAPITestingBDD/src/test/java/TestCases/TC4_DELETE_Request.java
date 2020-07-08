package TestCases;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TC4_DELETE_Request {

    @Test(priority = 5)
    public void deleteVideoGame() throws InterruptedException {
        Response res =
        given()
        .when()
                .delete("http://localhost:8080/app/videogames/123")
        .then()
                .statusCode(200)
                .log().body()
                .extract().response();

        Thread.sleep(4000);
        String jsonString = res.asString();

        Assert.assertEquals(jsonString.contains("Record Deleted Successfully"), true);
    }
}

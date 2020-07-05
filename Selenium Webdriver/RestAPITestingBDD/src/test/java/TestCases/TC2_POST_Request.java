package TestCases;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TC2_POST_Request {

    @Test(priority = 2)
    public void test_addNewVideoGame(){
        HashMap data = new HashMap();
        data.put("id", "123");
        data.put("name", "Skyrim");
        data.put("releaseDate", "2011-11-11T09:55:34.520Z");
        data.put("reviewScore", "6");
        data.put("category", "Action");
        data.put("rating", "Universal");

        Response resp =
        given()
                .contentType("application/json")
                .body(data)
        .when()
                .post("http://localhost:8080/app/videogames")
        .then()
                .statusCode(200)
                .log().body() //show data (response) in the console window
                .extract().response();

        String jsonString=resp.asString();
        Assert.assertEquals(jsonString.contains("Record Added Successfully"), true);


    }
}

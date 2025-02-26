package Utilities;


import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.junit.Assert;


public class RestClient {
    public static Response performGetRequest(String Uri, int responseCode) {


        RestAssured.config.sslConfig(new SSLConfig().allowAllHostnames());

        Response response = RestAssured.given()
                .relaxedHTTPSValidation()
                .when().log().all().get(Uri);

        // Print API Response

        System.out.println("RESPONSE ::");

        response.prettyPrint();


        Assert.assertEquals(responseCode, response.getStatusCode());

        return response;
    }

}

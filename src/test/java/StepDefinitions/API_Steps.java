package StepDefinitions;

import Utilities.RestClient;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class API_Steps {

    Response response;

    @When("User sends GET request to {string} and see status code is {int}")
    public void userSendsGETRequestTo(String uri,int statusCode) {
        response = RestClient.performGetRequest(uri,statusCode);
    }



}

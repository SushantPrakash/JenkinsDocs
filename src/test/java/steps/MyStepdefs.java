package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.restAssured.BaseURLs;
import org.restAssured.GetResponse;
import org.restAssured.RequestBuilder;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class MyStepdefs {

    BaseURLs baseURLs;
    String buildUrl;
    @Given("I build request specification to get list of all the civilizations in AOE")
    public void iPerformGetRequestToGetListOfAllTheCivilizationsInAOE() {
        buildUrl = new BaseURLs().getAOEUrl();
    }
    String resp;

    @Then("I expect status code of {int}")
    public void iExpectStatusCodeOf(int arg0) {

        resp =GetResponse.getResponse(buildUrl);
    }

    @And("List of all civilizations")
    public void listOfAllCivilizations() {

        System.out.println(resp);
    }


    @Given("I create url to get books")
    public void iHaveUrlToGetAllBooks() {
        baseURLs = new BaseURLs();
        buildUrl = baseURLs.getBaseBibleURL()+baseURLs.getBaseBookPath();


    }
    JsonPath jsonPath;
    @When("I perform get request for \"(.*)\"$")
    public void iPerformGetRequest(String urls) {
        String abbrev = "gn";
        if(urls.equals("All Books")){
            resp = GetResponse.getBookResponse(buildUrl);
        } else if (urls.equals("Specific Book")) {
            resp = GetResponse.getBookResponse(buildUrl, abbrev);
            jsonPath = GetResponse.getBookResponseJSON(buildUrl, abbrev);
        }


    }

    @Then("I validate list of books")
    public void iValidateListOfBooks() {
        String author = jsonPath.getString("author");
        System.out.println(jsonPath.prettyPrint());
        Assert.assertEquals("Mois�s",author);

    }

    @Given("I build url to create new user")
    public void iBuildUrlToCreateNewUser() {
    }

    @When("I perform post request")
    public void iPerformPostRequest() {
    }

    @Then("I validate user is created")
    public void iValidateUserIsCreated() {
    }
}

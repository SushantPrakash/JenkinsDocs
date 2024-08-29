package org.restAssured;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetResponse {
    static String response;
    public static String getResponse(String url){
        return given().contentType(ContentType.JSON).
                when().get(url).
                then().statusCode(200).extract().body().asPrettyString();
//        return response;
    }

    public static String getBookResponse(String url){
        return given().
                        log().all().
                when().
                        get(url).
                then().
                        statusCode(200).extract().body().asPrettyString();
//        return response;
    }
    public static String getBookResponse(String url, String abbrev){
        return given().
                        log().all().pathParam(":abbrev","gn").
                when().
                        get(url+"/{:abbrev}").
                then().
                        statusCode(200).extract().body().asPrettyString();
//        return response;
    }
    public static JsonPath getBookResponseJSON(String url, String abbrev){
        return given().
                log().all().pathParam(":abbrev","gn").
                when().
                get(url+"/{:abbrev}").
                then().
                statusCode(200).extract().jsonPath();
//        return response;
    }
}

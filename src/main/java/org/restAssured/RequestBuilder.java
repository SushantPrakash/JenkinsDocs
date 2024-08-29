package org.restAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {
    String url = "https://age-of-empires-2-api.herokuapp.com/api/v1/civilizations";

    public RequestSpecification getRequestSpec(){
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        RequestSpecification requestSpecification =
                requestSpecBuilder.setBaseUri(url).setContentType(ContentType.JSON).build();
        return requestSpecification;
    }

}

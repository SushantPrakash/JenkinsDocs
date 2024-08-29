package org.restAssured;

public class BaseURLs {
    private String baseBibleURL = "https://www.abibliadigital.com.br/api";
    private String baseBookPath = "/books";
    private String baseVersePath = "/verses";
    private String baseVersionPath = "/versions";
    private String baseUserPath = "/users";

    private String AOEUrl = "https://age-of-empires-2-api.herokuapp.com/api/v1/civilizations";

    public String getBaseBibleURL() {
        return baseBibleURL;
    }

    public String getBaseBookPath() {
        return baseBookPath;
    }

    public String getBaseVersePath() {
        return baseVersePath;
    }

    public String getBaseVersionPath() {
        return baseVersionPath;
    }

    public String getBaseUserPath() {
        return baseUserPath;
    }
    public String getAOEUrl() {
        return AOEUrl;
    }



}

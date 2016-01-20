package com.rest;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.util.GenericType;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DogServiceTest {

    static final String ROOT_URL = "http://localhost:8080/RESTfulExample/rest/";

    @Test
    public void printMessageTest() throws Exception {

//        Test via RESTEasy native library and hamcrest matchers
        ClientRequest request = new ClientRequest(ROOT_URL +"message/hello");
        ClientResponse<String> response = request.get(new GenericType<String>(){});
        String result = response.getEntity();
        assertThat("Method printMessage does not work correct", result, equalTo("Requested message: hello"));

//        Test via REST Assured framework
        get(ROOT_URL +"message/hello").
                then().assertThat().body(equalTo("Requested message: hello"));
    }
}

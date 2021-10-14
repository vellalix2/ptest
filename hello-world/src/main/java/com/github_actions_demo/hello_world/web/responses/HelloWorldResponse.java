package com.github_actions_demo.hello_world.web.responses;

public class HelloWorldResponse {

    String message;

    public HelloWorldResponse(String message) {
        this.message = message;
    }

    public HelloWorldResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}




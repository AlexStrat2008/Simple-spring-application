package com.strat.services.impl;

import com.strat.services.api.TestService;

public class TestServiceImpl implements TestService{
    private String message;

    public String getMessage() {
        return message;
    }

    public String setMessage(String message) {
        return this.message = message;
    }
}

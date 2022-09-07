package com.miquis.test_lambda.demo1.testSDK;



import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class Handler implements RequestHandler <Request, Object>{


    @Override
    public Object handleRequest(Request request, Context context) {
        return null;
    }
}

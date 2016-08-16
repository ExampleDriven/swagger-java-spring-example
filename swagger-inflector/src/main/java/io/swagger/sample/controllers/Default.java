package io.swagger.sample.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;

/**
 * Created by Peter_Szanto on 8/16/2016.
 */
public class Default {

    public ResponseContext peopleGET(RequestContext request, Integer size) {
        ResponseContext responseContext = new ResponseContext();
        responseContext.setEntity("Hello");
        return responseContext;
    }

}

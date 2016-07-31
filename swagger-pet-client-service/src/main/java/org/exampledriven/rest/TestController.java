package org.exampledriven.rest;

import io.swagger.client.ApiException;
import io.swagger.client.api.PetsapicontrollerApi;
import io.swagger.client.model.Pet;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Peter_Szanto on 7/30/2016.
 */
@RestController
public class TestController {

    private PetsapicontrollerApi petsapicontrollerApi;

    public TestController() {
        petsapicontrollerApi = new PetsapicontrollerApi();
        petsapicontrollerApi.getApiClient().setBasePath("http://localhost:8090/api");
    }

    @RequestMapping(value = "/pets/{id}", method = RequestMethod.GET)
    public Pet test(@PathVariable("id") Long id) throws ApiException {
        return petsapicontrollerApi.findPetByIdUsingGET(id);
    }


}

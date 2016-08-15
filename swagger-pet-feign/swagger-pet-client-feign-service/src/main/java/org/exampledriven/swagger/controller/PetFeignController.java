package org.exampledriven.swagger.controller;

import io.swagger.api.PetsApiClient;
import io.swagger.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PetFeignController {

    @Autowired
    private PetsApiClient petsApiClient;

    @RequestMapping(value = "/pet/{id}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper<Pet> getPet(@PathVariable long id) {

        ResponseEntity<Pet> petByIdUsingGET = petsApiClient.findPetByIdUsingGET(id);
        Pet pet = petByIdUsingGET.getBody();

        return new MessageWrapper<>(pet, "server called using feign");
    }

}
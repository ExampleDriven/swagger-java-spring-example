package org.exampledriven.eureka.customer.shared.client.controller;

import io.swagger.api.PetsApiClient;
import io.swagger.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PetFeignController {

    @Autowired
    private PetsApiClient petsApiClient;

    @RequestMapping(value = "/p/{id}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper<Pet> getPet(@PathVariable long id) {

        Pet pet = petsApiClient.findPetByIdUsingGET(id).getBody();

        return new MessageWrapper<>(pet, "server called using feign");
    }

}
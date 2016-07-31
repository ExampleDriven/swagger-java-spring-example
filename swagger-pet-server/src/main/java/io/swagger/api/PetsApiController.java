package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Pet;
import io.swagger.model.NewPet;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.LinkedList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-30T05:42:17.531Z")

@Controller
public class PetsApiController implements PetsApi {

    public ResponseEntity<Pet> addPet(@ApiParam(value = "Pet to add to the store" ,required=true ) @RequestBody NewPet pet) {
        // do some magic!
        return new ResponseEntity<Pet>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deletePet(@ApiParam(value = "ID of pet to delete",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Pet> findPetById(@ApiParam(value = "ID of pet to fetch",required=true ) @PathVariable("id") Long id) {
        // do some magic!
        Pet pet = new Pet();
        pet.setId(id);
        pet.setName("Test name");
        pet.setTag("Test tag");

        return new ResponseEntity<Pet>(pet, HttpStatus.OK);
    }

    public ResponseEntity<List<Pet>> findPets(@ApiParam(value = "tags to filter by") @RequestParam(value = "tags", required = false) List<String> tags,
        @ApiParam(value = "maximum number of results to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }

}

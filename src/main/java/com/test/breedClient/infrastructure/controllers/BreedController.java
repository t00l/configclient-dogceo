package com.test.breedClient.infrastructure.controllers;

import com.test.breedClient.domain.service.BreedService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/breeds/")
@AllArgsConstructor
public class BreedController {

    private BreedService breedService;

    @GetMapping(value = "/list/{breed_name}/full-breed", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getBreedFull(@PathVariable("breed_name") String breedName) {
        return breedService.getBreedFull(breedName);
    }
}



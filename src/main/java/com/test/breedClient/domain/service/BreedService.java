package com.test.breedClient.domain.service;

import com.test.breedClient.infrastructure.rest_client.BreedRestClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BreedService {

    @Autowired
    private BreedRestClient breedRestClient;

    public String getBreedFull(String breedName) {
        log.info("entramos a obtener datos de: [{}]", breedName);
        return breedRestClient.getBreedFull(breedName);
    }
}


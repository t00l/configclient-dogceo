package com.test.breedClient.domain.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class BreedDTO {
    String breed;
    String subBreeds;
    ArrayList images;
}

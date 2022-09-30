package com.springframework.pets;


public class PetServiceFactory {

    public PetService getPetService(String type) {
        switch (type) {
            case "cat":
                return new CatPetService();
            case "dog":
            default:
                return new DogPetService();
        }

    }
}

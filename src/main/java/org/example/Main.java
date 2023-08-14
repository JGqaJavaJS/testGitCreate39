package org.example;

import animalsobjects.AllAnimals;
import animalsobjects.Cat;
import animalsobjects.SuperDog;

public class Main {
    public static void main(String[] args) {

        AllAnimals allAnimals = new AllAnimals() {
            @Override
            public String getAnimalVoice() {
                return "brrrrrr";
            }
        };

        System.out.println(allAnimals.getAnimalVoice()+ " allAnimals.getAnimalVoice()");
        System.out.println(allAnimals.getLegsQuantity() + " allAnimals.getLegsQuantity()");

        Cat cat = new Cat();
        System.out.println(cat.getAnimalVoice()+ " cat.getAnimalVoice()");
        System.out.println(cat.getLegsQuantity() + " cat.getLegsQuantity()");

        SuperDog superDog = new SuperDog();
        System.out.println(superDog.getAnimalVoice()+ " superDog.getAnimalVoice()");
        System.out.println(superDog.getLegsQuantity() + " superDog.getLegsQuantity()");
    }
}
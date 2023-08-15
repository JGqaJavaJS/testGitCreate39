package org.example;

import animalsobjects.AllAnimals;
import animalsobjects.Cat;
import animalsobjects.CatNotMya;
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

        Cat cat = new Cat("df");
        System.out.println(cat.getAnimalVoice()+ " cat.getAnimalVoice()");
        System.out.println(cat.getLegsQuantity() + " cat.getLegsQuantity()");
        System.out.println(cat.jumpCat() + " cat.jumpCat()");

        SuperDog superDog = new SuperDog("jk");
        System.out.println(superDog.getAnimalVoice()+ " superDog.getAnimalVoice()");
        System.out.println(superDog.getLegsQuantity() + " superDog.getLegsQuantity()");

//        String digit = "7";
//        Integer d = Integer.valueOf(digit);
//        double dou = 7.222;
//        int b = (int) dou;

//        Cat cat2 = (Cat) allAnimals;
//        System.out.println(cat2.getAnimalVoice()+ " cat2.getAnimalVoice()");

        AllAnimals allAnimals1 = (AllAnimals) cat;
        System.out.println(allAnimals1.getAnimalVoice()+ " " +
                "---------------------------- allAnimals1.getAnimalVoice()");

    // gives error    SuperDog sd = (SuperDog) cat;

        CatNotMya catNotMya = new CatNotMya("sjh");
//        CatNotMya catNotMya1 = (CatNotMya) cat;
//        System.out.println(catNotMya1.getAnimalVoice()+ " " +
//                "---------------------------- catNotMya1.getAnimalVoice()");

        Cat cat2 = (Cat) catNotMya;
        System.out.println(cat2.getAnimalVoice()+ " " +
                "---------------------------- cat2.getAnimalVoice()");

        System.out.println("--------------------------------------------------------");
        cat.print3String();

    }
}
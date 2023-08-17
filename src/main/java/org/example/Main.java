package org.example;

import animalsobjects.*;

public class Main {
    public static void main(String[] args) {

//        AbstractExample abstractExample = new AbstractExample("some") {
//            @Override
//            public void func1() {
//                System.out.println("abstract class created");
//            }
//            @Override
//            public void func2() {
//                System.out.println("funct 2 from son class from main");
//            }
//        };
//        abstractExample.func1();
//        abstractExample.func2();

        AbstractExample abstractExample = new AbstractExample("abstract") {
            @Override
            public void func1() {

            }

            public void somesome() {
                System.out.println("somesome");
            }
        };
        abstractExample.func2();
       // abstractExample.getSome();
        System.out.println("abstract " + abstractExample.getSome());
       // abstractExample.somesome();

        SonOfAbstractClass son = new SonOfAbstractClass("son");
        son.func2();
        System.out.println("abstract " + son.getSome());
        son.somesome();

     //   SonOfAbstractClass son2 = (SonOfAbstractClass) abstractExample;
        AbstractExample ab2 = (AbstractExample) son; //new AbstrClassOut
        System.out.println("-----------_________________________ " + ab2.getSome());

        son.somesome();
       // ab2.somesome();

       // son = (AbstractExample) son;

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
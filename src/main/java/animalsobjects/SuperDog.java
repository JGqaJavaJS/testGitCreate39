package animalsobjects;

public class SuperDog implements AllAnimals {

    String c;

    public SuperDog(String c) {
        this.c = c;
    }

    @Override
    public int getLegsQuantity() {
        return 6;
    }

    @Override
    public String getAnimalVoice() {
        return "gavgav";
    }
}

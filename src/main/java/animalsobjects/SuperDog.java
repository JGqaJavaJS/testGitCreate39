package animalsobjects;

public class SuperDog implements AllAnimals {

    @Override
    public int getLegsQuantity() {
        return 6;
    }

    @Override
    public String getAnimalVoice() {
        return "gavgav";
    }
}

package animalsobjects;

public interface AllAnimals {

    public default int getLegsQuantity() {
        return 4;
    }

    public String getAnimalVoice();

}

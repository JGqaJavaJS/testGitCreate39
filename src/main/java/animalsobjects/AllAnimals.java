package animalsobjects;

public interface AllAnimals {

    String a = null;

    public default int getLegsQuantity() {
        return 4;
    }

    public String getAnimalVoice();

}

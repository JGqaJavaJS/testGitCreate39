package animalsobjects;

public class CatNotMya extends Cat{
    public CatNotMya(String b) {
        super(b);
    }

    @Override
    public String getAnimalVoice() {
        return "gav";
    }

}

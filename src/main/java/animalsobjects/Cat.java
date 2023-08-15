package animalsobjects;

public class Cat implements AllAnimals{
    public Cat(String b) {
        this.b = b;
    }

    String b;

    @Override
    public String getAnimalVoice() {
        return "myay";
    }

    public String jumpCat() {
        return "jump";
    }

    public void print3String() {
        print1();
        print2();
        print3();
    }

    private void print1() {
        System.out.println("1");
    }

    private void print2() {
        System.out.println("2");
    }

    private void print3() {
        System.out.println("3");
    }

}

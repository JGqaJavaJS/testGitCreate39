package animalsobjects;

public abstract class AbstractExample {

    String some;

    public AbstractExample(String some) {
        this.some = some;
    }

    public String getSome() {
        return some;
    }

    public void setSome(String some) {
        this.some = some;
    }
    public abstract void func1();

    public void func2() {
        System.out.println("funct 2");
    }
}

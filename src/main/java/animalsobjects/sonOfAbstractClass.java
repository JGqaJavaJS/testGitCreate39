package animalsobjects;

public class sonOfAbstractClass extends AbstractExample{
    public sonOfAbstractClass(String some) {
        super(some);
    }

    @Override
    public void func1() {
        System.out.println("funct 1 from son class");
    }
}

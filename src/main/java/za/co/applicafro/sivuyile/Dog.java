package za.co.applicafro.sivuyile;

/**
 * Created by sivuyile on 4/13/16.
 */
public class Dog extends Animal {
    private boolean canBuck;

    public boolean isCanBuck() {
        return canBuck;
    }

    public Dog(){}

    public Dog(int weigth, int size, int legs, int eyes, boolean canBuck) {
        super(weigth, size, legs, eyes);
        this.canBuck = canBuck;
    }
}

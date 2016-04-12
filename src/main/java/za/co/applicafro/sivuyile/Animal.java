package za.co.applicafro.sivuyile;

/**
 * Created by sivuyile on 4/13/16.
 */
public class Animal {
    private int weigth;
    private int size;
    private int eyes;
    private int legs;

    public Animal() {
    }

    public Animal(int weigth, int size, int legs, int eyes) {
        this.weigth = weigth;
        this.size = size;
        this.legs = legs;
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

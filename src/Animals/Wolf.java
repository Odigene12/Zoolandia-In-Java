package Animals;

/**
 * Created by odigene.joseph on 2/6/2017.
 */
public class Wolf extends Animal {

    public int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean alpha) {
        isAlpha = alpha;
    }

    public String eyeColor;

    public int packSize;

    public boolean isAlpha;


/*The @Override annotation tells the compiler that the method under it is supposed to override the same method from the parent class in this case. @Override can also be used within the same class.*/

    //Created an overriding method for the .sound method inherited from the parent class Animal
    @Override
    public String sound() {
        return "howl";
    }

    //Created an overriding method for the .numberOfKids method inherited from the parent class Animal
    @Override
    public int numberOfKids() {
        return 5;
    }

}

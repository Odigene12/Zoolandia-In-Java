package Animals;

/**
 * Created by odigene.joseph on 2/6/2017.
 */
public class Cat extends Animal {

    public String furColor;

    public String sound;

    public int numberOfTeeth;

    public boolean houseCat;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public boolean isHouseCat() {
        return houseCat;
    }

    public void setHouseCat(boolean houseCat) {
        this.houseCat = houseCat;
    }


    /*The @Override annotation tells the compiler that the method under it is supposed to override the same method from the parent class in this case. @Override can also be used within the same class.*/

    //Created an overriding method for the .sound method inherited from the parent class Animal
    @Override
    public String sound() {
        return "meow";
    }


    //Created an overriding method for the .numberOfKids method inherited from the parent class Animal
    @Override
    public int numberOfKids() {
        return 25;
    }
}

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
}

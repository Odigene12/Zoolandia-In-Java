package Animals;

/**
 * Created by odigene.joseph on 2/6/2017.
 */
public class Animal {

    public String name;

    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String sound() {
        return "AHHHH";
    }

    public int numberOfKids() {
        return 10;
    }

    //Added an overloaded constructor based off the getName() method.
    public String getName(String expectedName){
       return this.name = expectedName;
    }

    //Added an overloaded method based off the getAge() method.
    public int getAge(int expectedAge) {
        return this.age = expectedAge;
    }

    //Created one more constructor method that checks to make sure an animal is created with a name and age.
    public boolean doesAnimalHaveNameAndAge(String theName, int theAge){
        this.name = theName;
        this.age = theAge;

        if (theName != null && theAge != 0){
            return true;
        } else return false;
    }
}

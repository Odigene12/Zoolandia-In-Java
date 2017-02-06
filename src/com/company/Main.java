package com.company;

import Animals.Animal;
import Animals.Cat;
import Animals.Wolf;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Cat and its properties
        Cat myCat = new Cat();

        //Cat Setters
        myCat.setAge(75);
        myCat.setNumberOfTeeth(35);
        myCat.setFurColor("green");
        myCat.setName("Sam");

        //Cat Getters
        int myCatAge = myCat.getAge();
        int myCatTeethNumber = myCat.getNumberOfTeeth();
        String myCatFurColor = myCat.getFurColor();
        String myCatName = myCat.getName();

        //Wolf and its properties
        Wolf myWolf = new Wolf();

        //Wolf Setters
        myWolf.setName("Jake");
        myWolf.setAge(105);
        myWolf.setEyeColor("Pink");
        myWolf.setPackSize(15);
        myWolf.setNumberOfLegs(8);

        //Wolf Getters
        String myWolfName = myWolf.getName();
        int myWolfAge = myWolf.getAge();
        String myWolfEyeColor = myWolf.getEyeColor();
        int myWolfPackSize = myWolf.getPackSize();
        int myWolfNumberOfLegs = myWolf.getNumberOfLegs();

        //Used the variables assigned for my Cat to create a simple statement to be printed out in the console.
        System.out.println("I have a Cat named " + myCatName + " who is " + myCatAge + " years old, and has " + myCatTeethNumber + " number of teeth that is only as interesting as his " + myCatFurColor + " fur");

        //Used the variables assigned for my wolf to create a simple statement to be printed out in the console.
        System.out.println("I also have a Wolf named " + myWolfName + " who is " + myWolfAge + " years old, and has the most beautiful " + myWolfEyeColor + " eyes. He has a pack that is " + myWolfPackSize + " in size. Each of them have " + myWolfNumberOfLegs + " legs.");

        //After I created methods that overrode the .sound() and .numberOfKids() methods for my wolf, I used the methods to print out a couple of statements.
        System.out.println("My wolf has " + myWolf.numberOfKids() + " kids");
        System.out.println("My wolf goes " + myWolf.sound() + " at the moon");

        //After I created methods that overrode the .sound() and .numberOfKids() methods for my cat, I used the methods to print out a couple of statements.
        System.out.println("My cat has " + myCat.numberOfKids() + " kids");
        System.out.println("My cat goes " +myCat.sound());

        //Using the overloaded method .getName() from the Animal class to show how method overloading is used.

        //Created an instance of the Animal class
        Animal myAnimal = new Animal();
        String myAnimalName = myAnimal.getName("Steven");
        int myAnimalAge = myAnimal.getAge(915);

        //Using the overloaded method .getAge() from the Animal class to show how method overloading is used.
        System.out.println("I have a new animal named " + myAnimalName + " who is now " + myAnimalAge + " years old." );
    }
}

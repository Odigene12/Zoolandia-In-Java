package com.company;

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

        System.out.println("I have a Cat named " + myCatName + " who is " + myCatAge + " years old, and has " + myCatTeethNumber + " number of teeth that is only as interesting as his " + myCatFurColor + " fur");

        System.out.println("I also have a Wolf named " + myWolfName + " who is " + myWolfAge + " years old, and has the most beautiful " + myWolfEyeColor + " eyes. He has a pack that is " + myWolfPackSize + " in size. Each of them have " + myWolfNumberOfLegs + " legs.");
    }
}

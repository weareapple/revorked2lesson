package com.company;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet("name",45,Color.BLACK,new Shelter("home","bishkek"));
        Cat cat = new Cat("Tom",12,Color.WHITE,new Shelter("street","Sokuluk"),
                "hyze",new String[]{"common,sit down"});
        Cat cat2 = new Cat("Мышык", 2, Color.GRAY, new Shelter("street", "Where"),
                "omg",new String[]{"lie,voice"});

        System.out.println(pet.getInfo());
        System.out.println("__________________________________________");

        System.out.println(cat.getInfo());
        System.out.println("__________________________________________");
        System.out.println(cat2.getInfo());
        System.out.println("__________________________________________");

        cat.makeVoice("Fight",2);
        cat.makeVoice(1,"run");
        cat.makeVoice("2un");
    }
    }


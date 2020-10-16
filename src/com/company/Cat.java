package com.company;

public class Cat extends Pet{

    private String name;
    private String breed;
    private String[] commands;

    public Cat(String name, int age, Color color, Shelter shelter,String breed,String[] commands) {
        super(name, age, color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int num) {
        for (int i = 0; i < num ; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    public String getInfo() {
        return super.getInfo() +
                "\nname = "+name+
                "\nbreed = "+breed+
                "\ncommands = "+commands;

    }

}

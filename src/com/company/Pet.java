package com.company;

public class Pet extends Animal {

    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet(String name, int age, Color color, Shelter shelter) {
        super(name, age);
        this.color = color;
        this.shelter = shelter;
    }


    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return (int) Math.random() * 10 + 5;
    }

    public String getInfo() {
        return "Pet = " +
                "\nage = " + age +
                "\ncolor = " + color +
                "\nShelter.name = " + shelter.getName()+
                "\nShelter.address = " + shelter.getAddress();
    }
}

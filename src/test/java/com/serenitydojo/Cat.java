package com.serenitydojo;

public class Cat  {
    private String name;
    private String favourite_food;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood(){
        return "Tuna";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.favourite_food = usualFood();
    }
    public Cat(String name, String favourite_food, int age) {
        this.name = name;
        this.favourite_food = favourite_food;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setFavourite_food(String favouriteFood) {
        this.favourite_food = favouriteFood;
    }

    public String getFavourite_food() {
        return favourite_food;
    }

    public int getAge(){
        return age;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(name + " licks his paws");

    }
}

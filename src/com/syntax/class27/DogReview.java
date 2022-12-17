package com.syntax.class27;

public class DogReview {
    private String name;
    private String color;
    private String breed;

    public DogReview(String name, String color, String breed) {
        setName(name);
        setColor(color);
        setBreed(breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "My dogs names is "+name+" his color is "+color+" and his breed is "+breed;
    }
}

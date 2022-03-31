package com.company;

public class Cat extends Animal {



    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("This cat is meowing");
    }

    @Override
    public String toString() {
        return super.toString() + " and it's a cat";
    }
}

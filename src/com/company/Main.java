package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Dor");
//        System.out.println(animal1);
//
        Cat cat1 = new Cat("Zina");
//        cat1.speak();
//        System.out.println(cat1);
        level(678);
        int[] arr = {1,2,3};
        ArrayList list1 = new ArrayList();
        list1.add(4);         //0
        list1.add("Hello");   //2
        list1.add(cat1);      //3
        list1.add(animal1);   //4
        System.out.println(list1);
        list1.add(1,5);
        System.out.println(list1);
        list1.set(1,6);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
//        list2.add("String");
//        list2.add(cat1);

        ArrayList<Cat> list3 = new ArrayList<>();
        list3.add(cat1);
//        list3.add(animal1);

        ArrayList<Animal> list4 = new ArrayList<>();
        list4.add(animal1);
        list4.add(cat1);


    }

    // 0 - none, 1 - low, 2 - medium, 3 - high
    public static void level(int number){
        switch (number){
            case 0:
                System.out.println("none");
                break;
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("high");
                break;
            default:
                System.out.println("only numbers from 0 to 3");
        }
    }
}

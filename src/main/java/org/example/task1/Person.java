package org.example.task1;

public class Person implements Breathing, Eating {

    @Override
    public void breathe() {
        System.out.println("breathe " + getClass().getName());
    }

    @Override
    public void holdBreath() {
        System.out.println("holdBreath " + getClass().getName());
    }

    @Override
    public void eat() {
        System.out.println("eat " + getClass().getName());
    }

}

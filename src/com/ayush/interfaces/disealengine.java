package com.ayush.interfaces;

public class disealengine implements engine{

    @Override
    public void start() {
        System.out.println("boom the car has started ");
    }

    @Override
    public void stop() {
        System.out.println(" stopped the car");
    }

    @Override
    public void acc() {
        System.out.println("the car is accelerating");
    }
}

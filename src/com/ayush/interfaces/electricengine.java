package com.ayush.interfaces;

public class electricengine implements engine{
    @Override
    public void start() {
        System.out.println("prrrr the car has started ");
    }

    @Override
    public void stop() {
        System.out.println("zhhh stopped the car");
    }

    @Override
    public void acc() {
        System.out.println("boom the car is accelerating");
    }
}

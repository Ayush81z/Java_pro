package com.ayush.interfaces;

public class car implements engine, media, brake {
    @Override
    public void inc() {
        System.out.println(" the volume of the media has increased ");
    }

    @Override
    public void dec() {
        System.out.println(" the volume of the media has decreased ");
    }

    @Override
    public void brake() {
        System.out.println("it is braking the car");
    }

    @Override
    public void start() {
        System.out.println("boom the car has started ");
    }

    @Override
    public void startmusic() {
        System.out.println("starting the music ");
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

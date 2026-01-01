package com.ayush.interfaces;

public class cdplayer implements media{

    @Override
    public void startmusic() {
        System.out.println(" media player started ");
    }

    @Override
    public void stop() {
        System.out.println("media player has been stopped ");
    }

    @Override
    public void inc() {
        System.out.println("volume increased");
    }

    @Override
    public void dec() {
        System.out.println(" volume decreased  ");
    }
}

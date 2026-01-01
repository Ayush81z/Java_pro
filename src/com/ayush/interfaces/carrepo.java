package com.ayush.interfaces;

public class carrepo {
    private engine engine;
    private media player = new cdplayer();

    public carrepo () {
        engine = new disealengine();
    }

    public void start() {
        engine.start();
    }

    public void startmusic() {
        player.startmusic();
    }

    public void upgradeengine() {
        System.out.println("switching to electric engine");
        this.engine = new electricengine();
    }



}

package com.mbdev;

public class MusicPlayer {
    public Music music;

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}

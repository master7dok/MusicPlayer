package com.mbdev;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;

    public MusicPlayer(ClassicMusic classicMusic){
        this.classicMusic = classicMusic;
    }
    public void playMusic(){
        System.out.println("Playing: " + classicMusic.getSong());
    }
}

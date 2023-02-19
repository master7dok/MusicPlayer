package com.mbdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RapMusic rapMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }
    public void playMusic(){
        System.out.println("Playing: " + classicMusic.getSong());
        System.out.println("Playing: " + rapMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }
}

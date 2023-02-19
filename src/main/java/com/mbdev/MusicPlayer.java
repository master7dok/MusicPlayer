package com.mbdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music;
    private Music music2;
    private Music music3;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private Integer volume;

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music music, @Qualifier("rockMusic") Music music2, @Qualifier("rapMusic") Music music3) {
        this.music = music;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(){
        return ("Playing: " + music.getSong() + "\n" + music2.getSong() + "\n" + music3.getSong());
//        System.out.println("Playing: " + classicMusic.getSong());
//        System.out.println("Playing: " + rapMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
    }
}
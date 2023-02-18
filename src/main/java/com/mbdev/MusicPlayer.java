package com.mbdev;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music music;
    private String name;
    private String volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
public MusicPlayer() {}

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}

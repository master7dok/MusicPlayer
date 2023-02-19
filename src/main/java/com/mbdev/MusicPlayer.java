package com.mbdev;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

   public Music music;

    public MusicPlayer(Music music) {
    this.music = music;
    }

    public void playMusic(){
            System.out.println("Playing: " + music.getSong());
        }
    }


package com.mbdev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");

//        Music music = context.getBean("classicMusic", Music.class);
//        Music music2 = context.getBean("rockMusic", Music.class);
////        Music music3 = context.getBean("rapMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
////        MusicPlayer musicPlayer3 = new MusicPlayer(music3);
//        musicPlayer.playMusic();
//        musicPlayer2.playMusic();
////        musicPlayer3.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
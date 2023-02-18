package com.mbdev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml"
        );
//        Dependency Injection
//        Music music = context.getBean("typeMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        context.close();
    }
}

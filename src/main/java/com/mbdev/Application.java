package com.mbdev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml"
        );
        Music music = context.getBean("typeMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}

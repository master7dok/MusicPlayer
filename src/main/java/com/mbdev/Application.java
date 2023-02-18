package com.mbdev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");
        MusicPlayer firstMusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume("10");
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        System.out.println(firstMusicPlayer.getName() + " " + firstMusicPlayer.getVolume());
        context.close();
    }
}

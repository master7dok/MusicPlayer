package com.mbdev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mbdev")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }
    @Bean
    public RockMusic rockMusico(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusico(), classicMusic(), rapMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}

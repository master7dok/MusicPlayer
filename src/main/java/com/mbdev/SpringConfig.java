package com.mbdev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mbdev")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

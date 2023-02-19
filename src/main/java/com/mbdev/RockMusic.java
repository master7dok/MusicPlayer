package com.mbdev;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Eye of the tiger";
    }
}

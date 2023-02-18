package com.mbdev;

public class ClassicMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }
    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }
}

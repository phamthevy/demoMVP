package com.example.vypt.demofactorymethod;

public class Ship implements Vehicle{

    @Override
    public String environment(){
        return "Water";
    }

    @Override
    public int speed(){
        return 70;
    }

}

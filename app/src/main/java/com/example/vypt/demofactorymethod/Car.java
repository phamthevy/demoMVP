package com.example.vypt.demofactorymethod;

public class Car implements Vehicle{
    @Override
    public String environment(){
        return "Land";
    }

    @Override
    public int speed(){
        return 54;
    }
}

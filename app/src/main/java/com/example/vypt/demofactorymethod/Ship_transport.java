package com.example.vypt.demofactorymethod;

public class Ship_transport extends Transport{

    @Override
    public Vehicle create_vehicle(){
        return new Ship();
    }
}

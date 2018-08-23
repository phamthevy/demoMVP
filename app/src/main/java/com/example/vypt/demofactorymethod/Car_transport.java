package com.example.vypt.demofactorymethod;

public class Car_transport extends Transport {

    @Override
    public Vehicle create_vehicle(){
        return new Car();
    }
}

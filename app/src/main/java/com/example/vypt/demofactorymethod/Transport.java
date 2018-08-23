package com.example.vypt.demofactorymethod;

public abstract class Transport {

    String environment;
    int speed;

    public Transport() {
        Vehicle mVehicle = create_vehicle();
        environment = mVehicle.environment();
        speed = mVehicle.speed();
    }

    public abstract Vehicle create_vehicle();

}

package com.java;

public class Car extends Transport implements ILights {

    private boolean lights;

    public Car() {
        lights = false;
    }

    public Car (float _speed, int _weight, String _color, byte[] _coordinates) {
        setValue(_speed, _weight, _color, _coordinates);
        lights = false;
        System.out.println(getValues());

    }

    @Override
    public void moveObject() {
        System.out.println("Object is moving");
    }

    @Override
    public void stopObject() {
        System.out.println("Object stopped");
    }

    @Override
    public void setLight(boolean data) {
    this.lights = data;
    }

    @Override
    public void lightInfo() {
    if(lights) {
        System.out.println("Light is on");
    } else {
        System.out.println("Light is off");
    }
    }
}

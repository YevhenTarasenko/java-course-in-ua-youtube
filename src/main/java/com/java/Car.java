package com.java;

public class Car extends Transport {

    public Car (float _speed, int _weight, String _color, byte[] _coordinates) {
        setValue(_speed, _weight, _color, _coordinates);
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
}

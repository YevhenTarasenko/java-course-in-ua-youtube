package com.java;

public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinates;

    public void setValue(float _speed, int _weight, String _color, byte[] _coordinates) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinates = _coordinates;
    }

    public String getValues() {
        String info = "Speed: " + speed + ". Weight: " + weight + ". Color: " + color + "\n";

        String infoCoordinates = "Coordinates:\n";
        for(byte el: coordinates){
            infoCoordinates += el + "\n";
        }
        return info + infoCoordinates;
    }

}

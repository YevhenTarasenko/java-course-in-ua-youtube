package com.java;

public class Transport {

    protected float speed;
    protected int weight;
    protected String color;
    protected byte[] coordinates;

    public Transport() {};

    public Transport(float _speed, int _weight, String _color, byte[] _coordinates) {
//        System.out.println("Object is created");
        setValue(_speed, _weight, _color, _coordinates);
        System.out.println(getValues());
    }

    public Transport(float speed, int weight, String color) {
//        System.out.println("Object is created");
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = new byte[0];
    }

    public void setValue(float _speed, int _weight, String _color, byte[] _coordinates) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinates = _coordinates;
    }

    public String getValues() {
        String info = "Speed: " + speed + ". Weight: " + weight + ". Color: " + color + "\n";

        if(coordinates.length > 0){
            String infoCoordinates = "Coordinates:\n";
            for(byte el: coordinates){
                infoCoordinates += el + "\n";
            }
            return info + infoCoordinates;
        }

        return info;
    }

}

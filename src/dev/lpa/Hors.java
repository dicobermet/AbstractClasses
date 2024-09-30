package dev.lpa;

public class Hors extends  Mammal{
    public Hors(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.print(" Nice hair");
    }

    @Override
    public void makeNoise() {

    }
}

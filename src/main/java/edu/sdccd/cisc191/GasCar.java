package edu.sdccd.cisc191;

public class GasCar extends Car {

    private int fuelLevel = 0;


    public GasCar(String manufacturerName, int numMiles, int price, int numSeats, Option[] option, int numDoors){
        super(manufacturerName, numMiles, price, numSeats, option, numDoors);
    }
    public int getNumberOfDoors() {
        return numDoors;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void tankUp() {
        fuelLevel++;
    }
}

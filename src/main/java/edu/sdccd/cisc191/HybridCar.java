package edu.sdccd.cisc191;

public class HybridCar extends Car {

    private int batteryCharge = 0;
    private int fuelLevel = 0;

    public HybridCar(String manufacturerName, int numMiles, int price, int numSeats,Option [] option, int numDoors){
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

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void chargeUp() {
        batteryCharge++;
    }
}

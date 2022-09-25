package edu.sdccd.cisc191;

public class ElectricCar extends Car {

    private int batteryCharge = 0;

    public ElectricCar(String manufacturerName, int numMiles, int price, int numSeats, Option[] option, int numDoors){
        super(manufacturerName, numMiles, price, numSeats, option, numDoors);
    }
    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void chargeUp() {
        batteryCharge++;
    }
}

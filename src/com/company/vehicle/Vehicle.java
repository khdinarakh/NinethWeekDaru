package com.company.vehicle;

public class Vehicle {

    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    class Engine implements Runnable {
        @Override
        public void run() {
            while (speed < 220) {
                speed += 20;
                System.out.println("Speed increased: " + speed + " km/hour");
            }
        }
    }

    public void startMove() {
        Engine engine = new Engine();
        engine.run();
    }
}

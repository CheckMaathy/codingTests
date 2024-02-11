package com.checkmaathy.codingtest.exercism;


/**
 * In this exercise you'll be playing around with a remote controlled car,
 * which you've finally saved enough money for to buy.
 *
 * Cars start with full (100%) batteries. Each time you drive the car using the remote control,
 * it covers 20 meters and drains one percent of the battery.
 *
 * The remote controlled car has a fancy LED display that shows two bits of information:
 *
 * The total distance it has driven, displayed as: "Driven <METERS> meters".
 * The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".
 * If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".
 *
 * You have six tasks, each of which will work with remote controlled car instances.
 */
public class ElonsToyCar {

    public static void main(String[] args) {
    }

    private Car car = new Car();

    public ElonsToyCar() {}

    /**
     * Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance
     * @return
     */
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    /**
     * Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display
     * @return
     */
    public String distanceDisplay() {
        int distance = (100 - car.getBatteryPercentage()) * 20;
        return "Driven " + distance + " meters";
    }

    /**
     * Implement the ElonsToyCar.batteryDisplay() method to return the battery percentage as displayed on the LED display
     * @return
     */
    public String batteryDisplay() {
        if (car.getBatteryPercentage() <= 0) {
            return "Battery empty";
        }
        return "Battery at " + car.getBatteryPercentage() + "%";
    }

    /**
     * Implement the ElonsToyCar.drive() method that updates the number of meters driven
     */
    public void drive() {
        int battPercentage = car.getBatteryPercentage();
        if (battPercentage != 0) {
            updateBatteryAndDistance(battPercentage);
        }
    }

    private void updateBatteryAndDistance(int percentage) {
        car.setBatteryPercentage(percentage - 1);
        car.setDistanceTravelled(car.getDistanceTravelled() + 20);
    }

    /**
     * Update the ElonsToyCar.drive() method to update the battery percentage
     */

    /**
     * Update the ElonsToyCar.drive() method to not increase
     * the distance driven nor decrease the battery percentage when the battery is drained (at 0%)
     */

    public class Car {
        private int batteryPercentage;
        private int distanceTravelled;
        public int getBatteryPercentage() {
            return batteryPercentage;
        }

        public void setBatteryPercentage(int batteryPercentage) {
            this.batteryPercentage = batteryPercentage;
        }

        public int getDistanceTravelled() {
            return distanceTravelled;
        }

        public void setDistanceTravelled(int distanceTravelled) {
            this.distanceTravelled = distanceTravelled;
        }

        private Car() {
            this.batteryPercentage = 100;
            this.distanceTravelled = 0;
        }
    }
}

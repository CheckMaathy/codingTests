package com.checkmaathy.codingtest.exercism;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElonsToyCarTest {

    @Test
    @DisplayName("The static buy method returns a new remote controlled car instance")
    public void buy_new_car_returns_instance() {
        ElonsToyCar car = new ElonsToyCar();
        assertNotNull(car.buy());
    }

    @Test
    @DisplayName("The static buy method returns each time a new remote controlled car instance")
    public void buy_new_car_returns_new_car_each_time() {
        ElonsToyCar car1 = ElonsToyCar.buy();
        ElonsToyCar car2 = ElonsToyCar.buy();
        assertNotEquals(car1, car2);
    }

    @Test
    @DisplayName("The distanceDisplay method shows 0 meters message on a new car")
    public void new_car_distance_display() {
        ElonsToyCar car = new ElonsToyCar();
        assertEquals("Driven 0 meters", car.distanceDisplay());
    }

    @Test
    @DisplayName("The batteryDisplay method shows full battery message on a new car")
    public void new_car_battery_display() {
        ElonsToyCar car = new ElonsToyCar();
        assertEquals("Battery at 100%", car.batteryDisplay());
    }

    @Test
    @DisplayName("The distanceDisplay method shows the correct message after driving once")
    public void distance_display_after_driving_once() {
        ElonsToyCar car = new ElonsToyCar();
        car.drive();
        assertEquals("Driven 20 meters", car.distanceDisplay());
    }

    @Test
    @DisplayName("The distanceDisplay method shows the correct message after driving multiple times")
    public void distance_display_after_driving_multiple_times() {
        ElonsToyCar car = new ElonsToyCar();
        for (int i = 0; i < 17; i++) {
            car.drive();
        }
        assertEquals("Driven 340 meters", car.distanceDisplay());
    }

    @Test
    @DisplayName("The batteryDisplay method shows the correct message after driving once")
    public void battery_display_after_driving_once() {
        ElonsToyCar car = new ElonsToyCar();
        car.drive();
        assertEquals("Battery at 99%", car.batteryDisplay());
    }

    @Test
    @DisplayName("The batteryDisplay method shows battery empty after draining all battery")
    public void battery_display_when_battery_empty() {
        ElonsToyCar car = new ElonsToyCar();
        // Drain the battery
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        // Attempt to drive one more time (should not work)
        car.drive();
        assertEquals("Battery empty", car.batteryDisplay());
    }

    @Test
    @DisplayName("The batteryDisplay method shows the correct battery percentage after driving multiple times")
    public void battery_display_after_driving_multiple_times() {
        ElonsToyCar car = new ElonsToyCar();
        for (int i = 0; i < 23; i++) {
            car.drive();
        }
        assertEquals("Battery at 77%", car.batteryDisplay());
    }

    @Test
    @DisplayName("The distanceDisplay method shows the correct message after driving and draining all battery")
    public void distance_display_when_battery_empty() {
        ElonsToyCar car = new ElonsToyCar();
        // Drain the battery
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        // Attempt to drive one more time (should not work)
        car.drive();
        assertEquals("Driven 2000 meters", car.distanceDisplay());
    }
}
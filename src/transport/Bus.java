package transport;
import drivers.DriverD;

import java.security.PublicKey;

public class Bus extends Transport<DriverD> {

    public enum Capacity {
        VERYSMALL(0, 10),
        SMALL(0, 20),
        MEDIUM(40, 50),
        BUG(60, 80),
        VERYBIG(100, 120);
        private final int minCapacity;
        private final int maxCapacity;
        Capacity(int minCapacity, int maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }
        @Override
        public String toString() {
            if (minCapacity == 0) return "Вместимость : до " + maxCapacity + " мест";
            if (maxCapacity == 0) return "Вместимость: от " + minCapacity + " мест";
            return "Вместимость: " + minCapacity + " - " + maxCapacity + " мест";
        }
    }

    public Bus(String brand, String model, float engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void bestLapTime() {
        System.out.println("лучшее время круга бусика "+ this.brand + this.model);
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость бусика "+ this.brand + this.model);
    }
    @Override
    public String toString() {
        return "Bus марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume + " водитель:" + driver;

    }
}
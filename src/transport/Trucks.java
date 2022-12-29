package transport;
import drivers.DriverC;

import java.util.HashMap;

public class Trucks extends Transport<DriverC> {
    static final float TRUCKSLOWLIMIT = 3.5f;
    static final float TRUCKSHILIMIT = 12f;
    public enum  Carrying {
        N1( 0, TRUCKSLOWLIMIT),
        N2(TRUCKSLOWLIMIT, TRUCKSHILIMIT),
        N3(TRUCKSHILIMIT, 0 );

        private final float minCarrying;
        private final float maxCarrying;


        Carrying(float minCarrying, float maxCarrying ) {
            this.minCarrying  = minCarrying;
            this.maxCarrying  = maxCarrying;

        }

        @Override
        public String toString() {
            if( minCarrying==0 ) return "Грузоподъемность: до " + maxCarrying + " тонн" ;
            if( maxCarrying==0 ) return "Грузоподъемность: от " + minCarrying + " тонн" ;
            return "Грузоподъемность: от " + minCarrying + " тонн до " + maxCarrying + " тонн" ;
        }
    }

    public Trucks(String brand, String model, float engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void bestLapTime() {
        System.out.println(" лучшее время круга грузовика " + this.brand + this.model);
    }
    @Override
    public void maxSpeed() {
        System.out.println(" максимальная скорость грузовика " + this.brand + this.model );
    }
    @Override
    public String toString() {
        return "Truck марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume + " водитель:" + driver;

    }
}
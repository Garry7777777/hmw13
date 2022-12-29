
import drivers.*;
import transport.*;

public class Main {
    public static void main(String[] args) {

        DriverB driverBob = new DriverB("Bob", 123456, 5 );
        DriverC driverCharles  = new DriverC("Charles ", 456789, 10);
        DriverD driverDen = new DriverD("Den",159487, 7);

        Car carLada = new Car("Lada", "Granta",  1.7f, driverBob);
        Car carAudi = new Car("Audi", "A8 50 L TDI quat",  3.0f, driverBob);
        Car carBMW = new Car("BMW", "Z8",  3.0f, driverBob);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4f, driverBob);

        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);        System.out.println();

        Bus busLiaz = new Bus("ЛИАЗ", "677", 10f,driverDen);
        Bus busIcarus = new Bus("Icarus", "280", 20f,driverDen);
        Bus busPaz = new Bus("ПАЗ", " Горбатый", 5f,driverDen);
        Bus busMers = new Bus("Мерседес", " Люкс", 30f,driverDen);

        System.out.println(busLiaz);
        System.out.println(busIcarus);
        System.out.println(busPaz);
        System.out.println(busMers);        System.out.println();

        Trucks trucksZil = new Trucks("ЗИЛ", "130", 10f,driverCharles);
        Trucks trucksMaz = new Trucks("МАЗ", "200", 5f,driverCharles);
        Trucks trucksGaz = new Trucks("ГАЗ", "69", 5f,driverCharles);
        Trucks trucksMers = new Trucks("Мерседес", "Unimog", 20f,driverCharles);

        System.out.println(trucksZil);
        System.out.println(trucksMaz);
        System.out.println(trucksGaz);
        System.out.println(trucksMers);       System.out.println();

        trucksMaz.startMoving();
        busPaz.endMoving();         System.out.println();

        Competitive.pitStop();
        carLada.bestLapTime();
        busIcarus.maxSpeed();       System.out.println();

        driverBob.startMoving();
        driverDen.refuelCar();
        driverCharles.stopMoving();     System.out.println();

        busPaz.announcement();
        carLada.announcement();

        System.out.println(Car.CarBodyType.COUPE);
        System.out.println(Trucks.Carrying.N1);
        System.out.println(Trucks.Carrying.N2);
        System.out.println(Trucks.Carrying.N3);
        System.out.println(Bus.Capacity.SMALL);
        System.out.println(Bus.Capacity.VERYBIG);
    }
}
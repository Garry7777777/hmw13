package transport;
import drivers.DriverB;

public class Car extends Transport<DriverB> {

    public enum CarBodyType  {
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"),
        STATIONWAGON("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"),
        PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

        private final String bodyName;

        CarBodyType(String bodyName) {
            this.bodyName = bodyName;

        }

        @Override
        public String toString() {
            return "Название типа кузова на русском языке: " + bodyName ;
        }
    }

    public Car(String brand, String model, float engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);

    }
    @Override
    public void bestLapTime() {
        System.out.println("лучшее время круга авто " + this.brand + this.model);
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость авто " + this.brand + this.model);
    }
    @Override
    public String toString() {
        return "Car марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume + " водитель:" + driver;
    }
}
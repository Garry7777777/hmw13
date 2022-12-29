package transport;
import drivers.DriverB;

public class Car extends Transport<DriverB> {
    private CarBodyType carBodyType;
    public enum CarBodyType  {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATIONWAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String bodyName;

        CarBodyType(String bodyName) {
            this.bodyName = bodyName;
        }

        @Override
        public String toString() {
            return "Название типа кузова на русском языке: " + bodyName ;
        }
    }

    public Car(CarBodyType bodyType, String brand, String model, float engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    this.carBodyType = bodyType;
    }

    public void printType() {
        if(carBodyType == null) System.out.println("Данных по транспортному средству недостаточно");
        else System.out.println(carBodyType);
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
    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

}
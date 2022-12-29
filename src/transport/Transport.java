package transport;
public abstract class Transport<T> implements Competitive{
    protected final String brand;
    protected final String model;
    protected float engineVolume;
    protected T driver;
    public Transport(String brand, String model, float engineVolume, T driver) {

        if (brand == null) this.brand = "default";
        else this.brand = brand;

        if (model == null) this.model = "default";
        else this.model = model;

        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;

        this.driver = driver;

    }

    public void startMoving(){
        System.out.println("начал движение:" + this.brand + this.model + "  " + this.driver);
    }

    public void endMoving(){
        System.out.println("закончил движение:" + this.brand + this.model + "  " + this.driver);
    }

    public void announcement(){
        System.out.println(this.driver + " управляет автомобилем " + this.brand + this.model + "  " + " и будет участвовать в заезде");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}

package Seminar1;

public class HotDrink extends BottleOfWater {

    private  int temperature;

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Seminar1.HotDrink{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", volume=" + getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}

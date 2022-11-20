public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }
    @Override
    public String toString() {
        return brand + " " +  model +
                ", engine volume: " + engineVolume +
                ", color: " + color +
                ", year: " + year +
                ", country: " + country +
                ".";
    }
}

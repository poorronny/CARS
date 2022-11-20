public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    @Override
    public String toString() {
        return brand + " " + model +
                ", engine volume: " + engineVolume +
                ", color: " + color +
                ", year: " + year +
                ", country: " + country +
                ".";
    }
    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (year <= 2000) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "Default";
        } else {
            this.country = country;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("LADA", "Granta", 1.7, "yellow", 2015, "Russia");
        Car audi = new Car ("AUDI", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bmw = new Car ("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kia = new Car ("KIA", "Sportage 4th gen", 2.4, "red", 2018, "South Korea");
        Car hyundai = new Car ("HYUNDAI", "Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println(ladaGranta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }

}



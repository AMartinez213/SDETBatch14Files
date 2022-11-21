package GroupProject;

public class Car {

    double carPrice;
    String color;

    Car(double carPrice) {
        this.carPrice=carPrice;
    }
    void calculateSalePrice(double carPrice) {
        System.out.println(carPrice);
    }
}
    class Sedan extends Car {

        double length;

        Sedan(double carPrice, double length) {
            super(carPrice);
            this.length = length;
        }

        void calculateSalePrice(double carPrice, double length) {
            this.length = length;

            if (length > 20) {
                System.out.println("$"+carPrice*.95);
            } else {
                System.out.println("$"+carPrice *.9);
            }
        }
    }
        class Truck extends Car {
            double weight;
            Truck(double carPrice, double weight) {
                super(carPrice);
                this.weight = weight;
            }
            double calculateSalePrice(double carPrice, double weight) {
                if (weight > 2000) {
                    return carPrice * .9;
                } else {
                    return carPrice * .8;
                }
            }

        public static void main(String[] args) {

        Truck truck=new Truck(1,1);
        System.out.println(truck.calculateSalePrice(1000,1000));
        System.out.println(truck.calculateSalePrice(1000,3000));

        System.out.println("-------------------------------------------------");

        Sedan sedan=new Sedan(1000,30);
        sedan.calculateSalePrice(1000,25);
        sedan.calculateSalePrice(1000,15);

        }
    }


package builder;

public class Car {
    private final String title;
    private final String stsNumber;
    private final int weight;
    private final int power;

    public Car(String title, String stsNumber, int weight, int power) {
        this.title = title;
        this.stsNumber = stsNumber;
        this.weight = weight;
        this.power = power;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    public static class CarBuilder {
        private  String title;
        private  String stsNumber;
        private  int weight;
        private  int power;

        public CarBuilder title(String title){
            this.title = title;
            return this;
        }
        public CarBuilder stsNumber(String title){
            this.stsNumber = stsNumber;
            return this;
        }
        public CarBuilder weight(int weight){
            this.weight = weight;
            return this;
        }
        public CarBuilder power(int power){
            this.power = power;
            return this;
        }
        public Car build(){
            return new Car(title,stsNumber,weight,power);
        }
    }
}

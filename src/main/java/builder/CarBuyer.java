package Builder;

public class CarBuyer {

    public Car buy(String title, String stsNumber, int weight, int power){
       return Car.builder()
                .title(title)
                .stsNumber(stsNumber)
                .weight(weight)
                .power(power)
                .build();

    }
}

package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Winners getWinner() {
        int max = cars.stream()
                .mapToInt(Car::getCount)
                .filter(car -> car >= 0)
                .max()
                .orElse(0);

        return new Winners(cars.stream()
                .filter(car -> car.getCount() == max)
                .collect(Collectors.toList()));
    }
}

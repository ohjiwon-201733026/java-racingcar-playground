package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<String> carNames) {
        cars = new ArrayList<>(carNames.size());
        carNames.stream().forEach(carName -> cars.add(new Car(carName)));
    }

    public void move() {
        cars.stream().forEach(car -> car.move(RandomGenerator.generate()));
    }

    public String toString() {
        StringBuilder playResult = new StringBuilder();
        cars.stream().forEach(car -> playResult.append(car.toString()).append("\n"));
        return playResult.toString();
    }

    public String getWinner() {
        int maxPos = 0;
        for(Car car : cars) {
            if(car.isMaxPos(maxPos)) maxPos = car.getPosition();
        }

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPos) winners.add(car.getName());
        }
        return String.join(", ", winners);
    }
}

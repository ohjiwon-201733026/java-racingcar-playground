package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    private int getMaxPos() {
        int maxPos = 0;
        for(Car car : cars) {
            if(car.isMaxPos(maxPos)) maxPos = car.getPosition();
        }

        return maxPos;

    }

    public String getWinners() {
        int maxPos = getMaxPos();

        List<String> winners = cars.stream()
                .filter(car -> car.matchPosition(maxPos))
                .map(car -> car.getName())
                .collect(Collectors.toList());
        return String.join(", ", winners);
    }
}

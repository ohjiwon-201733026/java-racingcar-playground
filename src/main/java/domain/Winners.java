package domain;

import com.sun.tools.javac.util.StringUtils;

import java.util.List;

public class Winners {

    private List<Car> winnerCars;

    public Winners(List<Car> winnerCars) {
        this.winnerCars = winnerCars;
    }

    protected List<Car> getWinnerCars() {
        return this.winnerCars;
    }

    public String getWinnerName() {
        String [] winnerNames = winnerCars.stream().map(Car::getName).toArray(String[]::new);

        return String.join(", ", winnerNames);

    }

}

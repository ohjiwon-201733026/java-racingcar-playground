package domain;

import java.util.List;

public class Winners {

    private List<Car> winnerCars;

    public Winners(List<Car> winnerCars) {
        this.winnerCars = winnerCars;
    }

    protected List<Car> getWinnerCars() {
        return this.winnerCars;
    }
}

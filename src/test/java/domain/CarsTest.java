package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    public void setUp() {
        cars = new Cars();

        Car car1 =  new Car("A");
        car1.move(4);
        car1.move(5);

        Car car2 = new Car("B");

        cars.addCar(car1);
        cars.addCar(car2);
    }

    @Test
    @DisplayName("자동차 우승자 리턴")
    public void cars_getWinner() {
        assertThat(cars.getWinner().getWinnerCars().get(0).getName()).isEqualTo("A");

    }


    @Test
    @DisplayName("자동차 우승자 리턴 (우승자 여러명인 경우)")
    public void cars_getWinner_case2() {
        Car car3 = new Car("C");
        car3.move(8);
        car3.move(7);

        cars.addCar(car3);

        List<Car> result = cars.getWinner().getWinnerCars();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0).getName()).isEqualTo("A");
        assertThat(result.get(1).getName()).isEqualTo("C");

    }
}



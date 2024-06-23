package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    @DisplayName("자동차이름 5자이하")
    public void car_create() {
        String carName = "abcd4";

        Car car = new Car(carName);
    }

    @Test
    @DisplayName("자동차이름 5자 초과")
    public void car_create_over_5() {
        String carName = "abcde3";

        assertThrows(IllegalArgumentException.class, () -> new Car(carName));
    }

    @Test
    @DisplayName("4이상인 경우 자동차 이동")
    public void car_move_over_4() {
        int randomNum = 4;
        Car car = new Car("test");
        car.move(randomNum);

        Car expected = new Car("test", 2);

        assertThat(car).isEqualTo(expected);
    }
}

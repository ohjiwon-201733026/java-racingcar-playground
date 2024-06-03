package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    @DisplayName("5글자 초과 이름의 레이싱카 생성")
    public void car_name_lenght_greater_than_five() {
        assertThrows(IllegalArgumentException.class, () -> new Car("pobiii"));
    }

    @Test
    @DisplayName("레이싱카 전진 테스트")
    public void car_print() {
        Car car = new Car("car");

        String expected = "car : -";

        assertThat(expected).contains(car.toString());
    }

    @Test
    @DisplayName("random번호 4이상인 경우 move")
    public void car_move_greater_than_five() {
        Car car = new Car("car");

        car.move(4);

        assertThat(car.getCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("random번호 4미만인 경우 move")
    public void car_move_less_than_four() {
        Car car = new Car("car");

        car.move(3);

        assertThat(car.getCount()).isEqualTo(1);
    }


}

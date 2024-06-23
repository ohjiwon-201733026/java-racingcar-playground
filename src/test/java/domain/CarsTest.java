package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class CarsTest {

    @Test
    @DisplayName("Cars 생성")
    public void cars_create() {
        List<String> carNames = Arrays.asList("a","b","c");
        Cars cars = new Cars(carNames);
    }

    @Test
    @DisplayName("Cars move")
    public void cars_move() {
        
    }
}

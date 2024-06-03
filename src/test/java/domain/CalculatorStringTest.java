package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorStringTest {

    @Test
    @DisplayName("null인 경우 0리턴")
    public void splitAndSum_null_또는_빈문자() {
        CalculatorString calculatorString = new CalculatorString(null);

        int result = calculatorString.add();

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void splitAndSum_숫자하나() throws Exception {

        CalculatorString calculatorString = new CalculatorString("1");

        int result = calculatorString.add();

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void splitAndSum_쉼표구분자() throws Exception {
        CalculatorString calculatorString = new CalculatorString("1,2");
        int result = calculatorString.add();
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void splitAndSum_쉼표_또는_콜론_구분자() throws Exception {
        CalculatorString calculatorString = new CalculatorString("1,2:3");
        int result = calculatorString.add();
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_custom_구분자() throws Exception {
        CalculatorString calculatorString = new CalculatorString("//;\n1;2;3");
        int result = calculatorString.add();
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void splitAndSum_negative() throws Exception {

        assertThatThrownBy(() -> new CalculatorString("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }

}


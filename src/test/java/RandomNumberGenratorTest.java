import generator.RandomNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RandomNumberGenratorTest {

    @Test
    @DisplayName("0~9사이 랜덤번호 생성")
    public void generate() {
        assertThat(RandomNumberGenerator.generate()).isBetween(0,9);
    }
}

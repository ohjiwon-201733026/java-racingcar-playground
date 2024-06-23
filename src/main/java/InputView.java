import domain.Cars;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static Cars inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.asList(scanner.nextLine().split(","));

        return new Cars(names);
    }

    public static int inputGameCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}

import domain.Cars;
import domain.Winners;
import view.CarNamesInputView;
import view.TryCountInputView;

public class RacingCarMain {

    public static void main(String[] args) {

        Cars cars = CarNamesInputView.input();
        int tryCount = TryCountInputView.input();

        for(int i = 0; i < tryCount; i++) {
            cars.race();
            System.out.println(cars);
        }

        Winners winners = cars.getWinner();

        System.out.println(winners.getWinnerName() + "가 최종 우승했습니다.");

    }
}

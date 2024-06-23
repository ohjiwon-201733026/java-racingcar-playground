import domain.Cars;

public class RacingCarMain {

    public static void main(String[] args) {
        Cars cars = InputView.inputCarName();
        int count = InputView.inputGameCount();

        System.out.println("실행 결과");
        System.out.println(cars.toString());

        for(int i = 0; i < count; i++){
            cars.move();
            System.out.println(cars.toString());
        }

        String winners = cars.getWinners();
        System.out.println(winners +"가 최종 우승했습니다.");
    }
}

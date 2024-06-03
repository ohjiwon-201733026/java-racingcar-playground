package view;

import domain.Car;
import domain.Cars;

import java.util.Arrays;
import java.util.Scanner;

public class CarNamesInputView {

    public static Cars input() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        String[] carNames = scanner.nextLine().split(",");
        Cars cars = new Cars();

       Arrays.stream(carNames).forEach(carsName -> cars.addCar(new Car(carsName)));

       return cars;
    }
}

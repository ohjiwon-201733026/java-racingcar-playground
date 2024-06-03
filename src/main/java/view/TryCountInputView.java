package view;

import java.util.Scanner;

public class TryCountInputView {

    public static int input() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

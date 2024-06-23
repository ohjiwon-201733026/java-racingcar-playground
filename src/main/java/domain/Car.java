package domain;

import java.util.Objects;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.position = 1;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move(int randomNum) {
        if(randomNum >= 4) position++;
    }

    public boolean isMaxPos(int maxPos) {
        return this.position > maxPos;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder carToString = new StringBuilder();
        carToString.append(name).append(" : ");
        for(int i = 0; i < position; i++) carToString.append("-");

        return carToString.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}

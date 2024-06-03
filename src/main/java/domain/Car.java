package domain;

public class Car {

    private String name;
    private int count;

    public Car(String name) {
        if(name.length() > 5) throw new IllegalArgumentException("Car name is too long");
        this.name = name;
        this.count = 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" : ");

        for(int i = 0; i< count; ++i ) sb.append("-");

        return sb.toString();
    }

    public void move(int randomNum) {
        if(randomNum >= 4) count ++;
    }

    protected int getCount() {
        return count;
    }

    protected String getName() {
        return name;
    }
}

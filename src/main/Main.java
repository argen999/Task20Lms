package main;

import shablon.Car;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Car car = new Car()){
            car.drive();
        }

    }
}
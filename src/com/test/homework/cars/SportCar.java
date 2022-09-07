package com.test.homework.cars;

import java.sql.SQLOutput;

public class SportCar extends Car {
    public SportCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.println("SportCar engine: ");
        //implement here
        engine.setEngine();

    }


}

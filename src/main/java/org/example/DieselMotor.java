package org.example;

import org.springframework.stereotype.Component;

@Component
public class DieselMotor implements Motor{

    @Override
    public void start() {
        System.out.println("Diesel motor started");
    }
}

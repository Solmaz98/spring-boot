package org.example;

import org.springframework.stereotype.Component;

@Component
public class GasMotor implements Motor{
    @Override
    public void start() {
        System.out.println("Gas motor started");
    }
}

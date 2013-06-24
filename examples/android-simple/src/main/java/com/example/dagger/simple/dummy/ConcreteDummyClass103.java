package com.example.dagger.simple.dummy;

public class ConcreteDummyClass103 implements DummyClass103 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

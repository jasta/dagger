package com.example.dagger.simple.dummy;

public class ConcreteDummyClass230 implements DummyClass230 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

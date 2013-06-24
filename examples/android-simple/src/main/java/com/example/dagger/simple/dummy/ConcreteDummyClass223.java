package com.example.dagger.simple.dummy;

public class ConcreteDummyClass223 implements DummyClass223 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

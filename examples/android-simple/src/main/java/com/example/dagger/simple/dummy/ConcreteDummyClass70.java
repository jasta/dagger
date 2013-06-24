package com.example.dagger.simple.dummy;

public class ConcreteDummyClass70 implements DummyClass70 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

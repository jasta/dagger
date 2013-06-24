package com.example.dagger.simple.dummy;

public class ConcreteDummyClass240 implements DummyClass240 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

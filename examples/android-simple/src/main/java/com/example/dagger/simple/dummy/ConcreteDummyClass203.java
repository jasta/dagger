package com.example.dagger.simple.dummy;

public class ConcreteDummyClass203 implements DummyClass203 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

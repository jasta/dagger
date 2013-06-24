package com.example.dagger.simple.dummy;

public class ConcreteDummyClass360 implements DummyClass360 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

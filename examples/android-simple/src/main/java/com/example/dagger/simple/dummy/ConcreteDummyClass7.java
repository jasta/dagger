package com.example.dagger.simple.dummy;

public class ConcreteDummyClass7 implements DummyClass7 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

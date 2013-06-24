package com.example.dagger.simple.dummy;

public class ConcreteDummyClass480 implements DummyClass480 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

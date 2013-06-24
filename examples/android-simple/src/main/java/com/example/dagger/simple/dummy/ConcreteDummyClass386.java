package com.example.dagger.simple.dummy;

public class ConcreteDummyClass386 implements DummyClass386 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

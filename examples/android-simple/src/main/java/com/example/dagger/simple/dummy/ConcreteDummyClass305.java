package com.example.dagger.simple.dummy;

public class ConcreteDummyClass305 implements DummyClass305 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

package com.example.dagger.simple.dummy;

public class ConcreteDummyClass444 implements DummyClass444 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

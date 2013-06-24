package com.example.dagger.simple.dummy;

public class ConcreteDummyClass9 implements DummyClass9 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

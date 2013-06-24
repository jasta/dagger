package com.example.dagger.simple.dummy;

public class ConcreteDummyClass37 implements DummyClass37 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

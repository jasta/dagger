package com.example.dagger.simple.dummy;

public class ConcreteDummyClass401 implements DummyClass401 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

package com.example.dagger.simple.dummy;

public class ConcreteDummyClass180 implements DummyClass180 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

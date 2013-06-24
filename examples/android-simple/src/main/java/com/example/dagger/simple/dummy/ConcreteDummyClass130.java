package com.example.dagger.simple.dummy;

public class ConcreteDummyClass130 implements DummyClass130 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

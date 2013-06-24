package com.example.dagger.simple.dummy;

public class ConcreteDummyClass80 implements DummyClass80 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

package com.example.dagger.simple.dummy;

public class ConcreteDummyClass282 implements DummyClass282 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

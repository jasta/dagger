package com.example.dagger.simple.dummy;

public class ConcreteDummyClass121 implements DummyClass121 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

package com.example.dagger.simple.dummy;

public class ConcreteDummyClass38 implements DummyClass38 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

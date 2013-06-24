package com.example.dagger.simple.dummy;

public class ConcreteDummyClass31 implements DummyClass31 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

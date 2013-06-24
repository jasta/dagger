package com.example.dagger.simple.dummy;

public class ConcreteDummyClass235 implements DummyClass235 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}

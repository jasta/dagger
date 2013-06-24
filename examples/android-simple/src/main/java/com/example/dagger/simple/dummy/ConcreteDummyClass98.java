package com.example.dagger.simple.dummy;

public class ConcreteDummyClass98 implements DummyClass98 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
